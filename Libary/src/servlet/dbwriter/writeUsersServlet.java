package servlet.dbwriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import Java.JavaBeen.operator.writer;

@WebServlet(name = "writeUsersServlet",urlPatterns = "/writeUsersServlet")
public class writeUsersServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String Uno=request.getParameter("Uno");
        String Class=request.getParameter("Class");
        String Academy=request.getParameter("Academy");
        String Role=request.getParameter("Role");
        String UserName=request.getParameter("UserName");
        new writer().sign_up(Uno,Class,Academy,Role,UserName);
        request.getRequestDispatcher("/readUsers").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
