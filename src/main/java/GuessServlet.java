import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessServlet",urlPatterns = "/guessWho")
public class GuessServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("userGuess.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Random rand = new Random();
        int  n = rand.nextInt(5) + 1;

        int userGuess = Integer.parseInt(req.getParameter("guess"));

        String message;

        if(userGuess == n){
            message = "you won!";
        } else if (userGuess > n){
            message = "try a lower digit!";
        } else {
            message = "try a higher digit!";
        }

        System.out.println(message);

        req.setAttribute("message", message );

        req.getRequestDispatcher("compareGuess.jsp").forward(req,resp);
    }
}
