package servlet.dbwriter;

import Java.JavaBeen.operator.writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RentBookServlet")
public class RentBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String Uno=request.getParameter("Uno");
        String Bno=request.getParameter("Bno");
        String BName=request.getParameter("BName");
        if (new writer().rent_book(Uno,Bno,BName))
            request.setAttribute("isOver","借书成功");
        else
            request.setAttribute("isOver","借书成功");
        request.getRequestDispatcher("/forRentServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
