package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        response.getWriter().append(Arrays.toString(numbers));
        response.getWriter().append("\n");
        Arrays.sort(numbers);
        response.getWriter().append(Arrays.toString(numbers));
    }
}
