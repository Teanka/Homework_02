import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@WebServlet(name = "Servlet13",urlPatterns = "/Servlet13")
public class Servlet13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> oopList = readFromFile();
        for(String oop: oopList) {
            response.getWriter().append(oop).append("\n");
        }
    }

    private List<String> readFromFile() throws IOException {
        Path path = Paths.get("/home/teanka/Desktop/Homework_02/oop.txt");
        return Files.readAllLines(path);
    }
//
//    W projekcie stwórz servlet Servlet13, dostępny pod adresem /Servlet13,
//    Servlet wczyta zawartość pliku oop.txt, a następnie wyświetli jego zawartość na stronie.
}
