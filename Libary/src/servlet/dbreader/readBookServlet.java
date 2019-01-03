package servlet.dbreader;

import Java.JavaBeen.from.imformation_books;
import Java.JavaBeen.operator.reader;
import Java.JavaBeen.table.Books;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "readBookServlet",urlPatterns = "/readBookServlet")
public class readBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String Books=null;
        Books=request.getParameter("Books");
        List<Books> list = new reader().getBooks(Books);
        request.setAttribute("list",list);
        request.getRequestDispatcher("/add_delbooks.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
