package servlet.dbwriter;

import Java.JavaBeen.operator.writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddBookServlet")
public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String Bno=request.getParameter("Bno");
        String BName=request.getParameter("BName");
        String Price=request.getParameter("Price");
        String Location=request.getParameter("Location");
        String Author=request.getParameter("Author");
        request.setAttribute("isAdd",new writer().add_Book(Bno,BName,Price,Location,Author));
        request.getRequestDispatcher("/BooksServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
