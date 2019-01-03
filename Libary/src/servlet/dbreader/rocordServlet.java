package servlet.dbreader;

import Java.JavaBeen.operator.reader;
import Java.JavaBeen.table.Rent;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "rocordServlet")
public class rocordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        List<Rent> list=new reader().getRcord(request.getParameter("Uno"),request.getParameter("Bno"));
        request.setAttribute("records",list);
        if (request.getAttribute("isDelete")!=null){
            if ((boolean)request.getAttribute("isDelete"))
                request.setAttribute("isDelete","删除成功");
            else
                request.setAttribute("isDelete","删除失败");
        }

        request.getRequestDispatcher("#").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
