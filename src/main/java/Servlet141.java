import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet141", urlPatterns = "/Servlet041")
public class Servlet141 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        for(int i =0; i<=7;i++){
            response.getWriter().append("<a href = \"http://localhost:8080/Servlet042?id=" + i +" \">"+"link do id " + i +"</a> <br>");
        }
        }
//    Na pierwszej stronie (Servlet141) wygeneruj linki do strony Servlet142, które będą przesyłały metodą GET id szukanego produktu (wygeneruj dla id z zakresu od 0 do 7).
    }

