import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");

        if(name == null){
            name = "world dude";
        }



        res.getWriter().println("<h1 style=\"font-family: fantasy;\" >HELLO " + name + "!</h1>");
        res.getWriter().println("<p>Enter your name: </p>");
        res.getWriter().println("<form action=\"/hello-world\">");
        res.getWriter().println("<input name=\"name\" /> ");
        res.getWriter().println("</form> ");


        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello,World!</h1>");



    }
}
