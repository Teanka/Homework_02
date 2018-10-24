import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet142", urlPatterns = "/Servlet042")
public class Servlet142 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        String products[] = {
                "Asus Transformr;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };
        if(!id.isEmpty()&&id!=null){
            try{
                int idInt = Integer.parseInt(id);
                if(idInt<0||idInt>7){
                    response.getWriter().append("Product not found");
                }else {
                    String chosenProduct = products[idInt];
                    String[] words = chosenProduct.split(";");
                    response.getWriter().append(words[0] +" - "+words[words.length-1] +" zł");
                }
            }catch(NumberFormatException e){
                response.getWriter().append(" id nie zawierało liczby");
            }
        } else{
            response.getWriter().append(" id było puste");
        }
    }

//    Druga strona (Servlet142) po odebraniu danych powinna odnaleźć w przygotowanej tablicy lub liście produkt
//    (zakładamy że id kolejny element). Poniżej znajduje się przykładowa tablica z produktami:
//    Jeśli produkt znajduje się w tablicy powinna zostać wyświetlona jego nazwa i cena np.Asus Transformer - 2999.99zł
//    Jeśli wybierzemy produkt spoza zakresu powinien zostać wyświetlony komunikat Product not found.
}
