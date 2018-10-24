import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Servlet16",urlPatterns = "/Servlet16")
public class Servlet16 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Map<String, String> map = new HashMap<>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }
        response.getWriter().append("<ul>");
        if(map!=null&&!map.isEmpty()) {
            Set<String> secik = map.keySet();
            Iterator<String> iterator = secik.iterator();
            String klucz;
            while (iterator.hasNext()) {
                klucz = iterator.next();
                response.getWriter().append("<li> nazwaNagłówka " + klucz + " wartość: " + map.get(klucz) + "</li>");
            }
            response.getWriter().append("</ul>");
        } else{
            response.getWriter().append("Brak nazw i wartości nagłówków do wyświetlenia");
        }

    }
//    Wyświetl wszystkie informacje w formacie: nazwaNagłówka : wartość
//    wyszedł taki wynik:
//nazwaNagłówka accept-language wartość: en-US,en;q=0.5
//    nazwaNagłówka host wartość: localhost:8080
//    nazwaNagłówka upgrade-insecure-requests wartość: 1
//    nazwaNagłówka connection wartość: keep-alive
//    nazwaNagłówka accept-encoding wartość: gzip, deflate
//    nazwaNagłówka user-
//    agent wartość: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:62.0) Gecko/20100101 Firefox/62.0
//    nazwaNagłówka accept wartość: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8

}
