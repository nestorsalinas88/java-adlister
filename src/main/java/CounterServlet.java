import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet{

    private int count = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reset = (String) req.getAttribute("reset");

        if("true".equals(reset)){
            count = 0;
        } else {
            count += 1;
        }
        resp.getWriter().println("Page number: " + count);
        resp.getWriter().println("<a href ='/count?reset=true'>Reset");
    }

}
