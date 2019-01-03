package servlet.dbreader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.IOException;
import Java.JavaBeen.operator.reader;
import Java.JavaBeen.table.Users;

@WebServlet(name = "readUsers",urlPatterns = "/readUsers")
public class readUsers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        List<Users> list=new reader().getUsersTable(request.getParameter("Users"));
        request.setAttribute("list",list);
        request.getRequestDispatcher("add_delUser.jsp").forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
