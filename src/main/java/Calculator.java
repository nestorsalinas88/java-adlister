import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Calculator", urlPatterns = "/calculator")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("numberInput.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double x = Double.parseDouble(req.getParameter("x"));
        double y = Double.parseDouble(req.getParameter("y"));
        String op = req.getParameter("op");

        double result;

        if (op.equals("+")){
            result = x + y;
        }
        else if (op.equals("*")){
            result = x * y;
        }
        else {
            result = 0.0;
        }
        req.setAttribute("result", result);
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }

}

