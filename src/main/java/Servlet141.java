import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "Servlet141", urlPatterns = "/Servlet041")
public class Servlet141 extends HttpServlet {
    Integer id;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        id = random.nextInt(6)+1;
        String iD = id.toString();
            request.setAttribute("data",request.getAttribute(iD));
            response.sendRedirect("http://localhost:8080/HelloWorld/testServlet041");
        }
    }

