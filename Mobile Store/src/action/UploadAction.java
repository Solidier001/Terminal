package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.Good;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.OrmService;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Struts2上传文件
 * @Author 黄继红
 */
public class UploadAction extends ActionSupport {
    private String name;
    private String price;
    private String discribe;

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    //接收文件
    private File icon;
    //接收文件的文件名：File对象+FileName
    private String iconFileName;
    //接收文件的文件类型：File对象+ContentType
    private String iconContentType;

    public void setIcon(File icon) {
        this.icon = icon;
    }

    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    public void setIconContentType(String iconContentType) {
        this.iconContentType = iconContentType;
    }

    @Override
    public String execute() throws Exception {
        String path="/img";
        String root= ServletActionContext.getServletContext().getRealPath(path);
        try {
            String FileName=iconFileName;
            FileUtils.copyFile(icon,new File(root+"\\"+FileName));
            ServletContext context=ServletActionContext.getServletContext();
            WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
            OrmService orm=(OrmService)wac.getBean("OrmService");
            Good good=new Good();
            good.setDiscribe(discribe);
            good.setSrc(path+"/"+FileName);
            good.setName(name);
            good.setPrice(price);
            orm.save(good);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
