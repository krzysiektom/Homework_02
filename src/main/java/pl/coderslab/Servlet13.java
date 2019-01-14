package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@WebServlet("/Servlet13")
public class Servlet13 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        Path path1 = Paths.get("/home/krzysztof/workspace/Homework_02/src/oop.txt");
        try {
            for (String line : Files.readAllLines(path1)) {
                response.getWriter().append(line).append("<br>");
            }
        } catch (IOException e) {
            response.getWriter().append("Błąd otwarcia pliku");
        }
    }
}
