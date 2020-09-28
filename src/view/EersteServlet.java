package view;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/DynamischePagina")
public class EersteServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Index</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a id=\"home\" href=\"index.html\">Home</a>");
        Random random = new Random();
        int randomNumber = (random.nextInt(10)+1);
        out.println("<p id=\"dynamisch\">"+ randomNumber+"</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
