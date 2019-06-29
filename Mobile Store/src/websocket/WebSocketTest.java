package websocket;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

import dao.Message;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import util.ConfiguratorForHttpSession;
import service.OrmService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
@ServerEndpoint(value = "/websocket",configurator = ConfiguratorForHttpSession.class)
public class WebSocketTest {
//    private static Map<String, WebSocketTest> webSocketmap = new ConcurrentHashMap<>();
    private static int onlineCount = 0;
    private static CopyOnWriteArraySet<WebSocketTest> webSocketSet = new CopyOnWriteArraySet<WebSocketTest>();
    private Session session;
    private HttpSession httpSession;
    @OnOpen
    public void onOpen(Session session,EndpointConfig config){
        this.httpSession=(HttpSession) config.getUserProperties().get(HttpSession.class.getName());
        String id=(String) httpSession.getAttribute("id");
        this.session = session;
        webSocketSet.add(this);
//        if (webSocketmap.get(id)==null){
//        webSocketmap.put(id,this);}
        addOnlineCount();
        System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
    }
    @OnClose
    public void onClose(){
        webSocketSet.remove(this);
        subOnlineCount();
        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }
    @OnMessage
    public void onMessage(String text, Session session) {
        System.out.println("来自客户端的消息:" + text);
        String id=(String) httpSession.getAttribute("id");
        for(WebSocketTest item: webSocketSet){
            try {
                ServletContext context=httpSession.getServletContext();
                WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
                Message messageObject=new Message();
                OrmService OrmService=(service.OrmService)wac.getBean("OrmService");
                messageObject.setSender(id);
                System.out.println(id);
                String message="{\"id\":\""+id+'\"'+",\"message\":\""+text+"\"}";
                messageObject.setContent(text);
                messageObject.setSendtime(new Date());
                OrmService.save(messageObject);
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
        if (getOnlineCount() < 2) {
            try {
                this.sendMessage("{\"id\":\"" + "系统" + '\"' + ",\"message\":\"" + "这是条自动回复，请等待客服人员到来" + "\"}");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @OnError
    public void onError(Session session, Throwable error){
        System.out.println("发生错误");
        error.printStackTrace();
    }
    public void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        WebSocketTest.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketTest.onlineCount--;
    }
}
