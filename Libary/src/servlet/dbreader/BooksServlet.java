package servlet.dbreader;

import Java.JavaBeen.table.Books;
import Java.JavaBeen.operator.reader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BooksServlet")
public class BooksServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        List<Books> list=new reader().getBooks(request.getParameter("Books"));
        request.setAttribute("list",list);
            boolean isAdd=(boolean)request.getAttribute("isAdd");
            if (isAdd)
                request.setAttribute("isAdd","添加成功");
            else
                request.setAttribute("isAdd","添加失败");

        request.getRequestDispatcher("/add_delbooks.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
