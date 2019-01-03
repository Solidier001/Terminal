package servlet.dbreader;

import Java.JavaBeen.from.Informations;
import Java.JavaBeen.from.imformation_books;
import Java.JavaBeen.operator.reader;
import Java.JavaBeen.table.Books;
import Java.JavaBeen.table.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SignUpServlet")
public class SignUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String Uno=request.getParameter("Uno");
        String password=request.getParameter("password");
        Users user =new reader().getUser(Uno);
        try {
            if(user.getPassword().equals(password.trim())){
                Informations informations=new Informations(user.getUserName(),null);
                HttpSession session=request.getSession();
                session.setAttribute("username",user.getUserName());
                if(user.getRole().equals("管理员")){
                    List<Books> list = new reader().getBooks("");
                    request.setAttribute("list",list);
                    request.getRequestDispatcher("/add_delbooks.jsp").forward(request,response);}
                else{

                    List<imformation_books> list = new reader().getBooksTable(request.getParameter("Books"));
                    request.setAttribute("list",list);
                    request.getRequestDispatcher("/Foruse.jsp").forward(request,response);}
            }
            else{
                Informations informations=new Informations(user,"用户名或密码错误");
                request.setAttribute("information",informations);
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }
        }
        catch (NullPointerException e){
            Informations informations=new Informations(user,"用户名错误");
            request.setAttribute("information",informations);
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
