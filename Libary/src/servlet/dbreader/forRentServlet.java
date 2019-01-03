package servlet.dbreader;

import Java.JavaBeen.from.forReturn;
import Java.JavaBeen.operator.reader;
import Java.JavaBeen.table.Books;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "forRentServlet",urlPatterns = "/forRentServlet")
public class forRentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        List<Books> list=new reader().forRent(request.getParameter("Books"));
        request.setAttribute("list",list);
        request.getRequestDispatcher("/rentbooks.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
