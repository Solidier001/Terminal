package servlet.dbupdater;
import Java.JavaBeen.operator.reader;
import Java.JavaBeen.from.forReturn;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ReadyReturnServlet")
public class ReadyReturnServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        List<forReturn> list=new reader().forReturnBooks(request.getParameter("BName"));
        request.setAttribute("Return",list);
        request.getRequestDispatcher("/returnBooks.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
