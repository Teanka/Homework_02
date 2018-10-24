import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet(name = "Servlet15",urlPatterns = "/Servlet15")
public class Servlet15 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int[] array = new int[10];
        int[] randomArr;
        Random random = new Random();
        for(int i=0; i<array.length-1; i++ ){
            array[i] = random.nextInt(102)-1;
        }
        randomArr = array;
        response.getWriter().append("<table><thead></thead><tbody><tr>");
        for(int j =0; j<randomArr.length-1;j++){
            response.getWriter().append("<td>"+ randomArr[j] +"</td>");
        }
        Arrays.sort(array);

        response.getWriter().append("</tr> <tr>");
        for(int j =0; j<array.length-1;j++){
            response.getWriter().append("<td>"+ array[j] +"</td>");
        }
        response.getWriter().append("</tr></tbody></table>");
    }



//    Zadanie 5
//
//    W projekcie stwórz servlet Servlet15 dostępny pod adresem /Servlet15, który wylosuje 10 liczb z zakresu 1-100. Następnie Wyświetl dwie tabelki z tymi liczbami:
//
//    Pierwsza tabelka powinna wyświetlić wartości w kolejności jakiej zostały wylosowane.
//    Druga tabelka powinna wyświetlać wartości posortowane (od najmniejszej do największej).

}
