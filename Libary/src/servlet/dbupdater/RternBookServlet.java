package servlet.dbupdater;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Java.JavaBeen.operator.update;
import java.io.IOException;
@WebServlet(name = "RternBookServlet")
public class RternBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        new update().ReturnBook(request.getParameter("Bno"));
        request.getRequestDispatcher("/ReadyReturnServlet").forward(request,response);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
