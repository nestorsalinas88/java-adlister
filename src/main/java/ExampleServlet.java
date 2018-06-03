import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ExampleServlet", urlPatterns = "/example")
public class ExampleServlet extends HttpServlet{

    protected void doGet( HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

        request.getRequestDispatcher("partials/userForm.jsp").forward(request,response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("first_name");
        request.setAttribute("first_name", first_name);
        request.getRequestDispatcher("profile.jsp").forward(request,response);

        String last_name = request.getParameter("last_name");
        request.setAttribute("last_name", last_name);
        request.getRequestDispatcher("profile.jsp").forward(request,response);


    }

}