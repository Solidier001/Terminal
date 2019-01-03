package servlet.dbreader;

import Java.JavaBeen.from.imformation_books;
import Java.JavaBeen.operator.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ForuserServlet")
public class ForuserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        List<imformation_books> list = new reader().getBooksTable(request.getParameter("Books"));
        request.setAttribute("list",list);
        request.getRequestDispatcher("/Foruse.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
