package servlet.dbupdater;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import Java.JavaBeen.operator.writer;
@WebServlet(name = "RentServlet",urlPatterns = "/RentServlet")
public class RentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        new writer().rent_book(request.getParameter("Uno"), request.getParameter("Bno"), request.getParameter("BName"));
        response.sendRedirect("/forRentServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
