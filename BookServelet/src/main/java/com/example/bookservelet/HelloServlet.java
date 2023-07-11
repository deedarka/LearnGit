package com.example.bookservelet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static java.lang.System.out;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
     //  response.setContentType("text/html");
      //  request.getRequestDispatcher("BookServelet/src/main/webapp/add.jsp").forward(request, response);
         String BookName=request.getParameter("Book Name");
         String BookWitter=request.getParameter("Book Witter");
         String BookOfYear=request.getParameter("Book Issue year");
         String BookPages=request.getParameter("Pages of Book");
        response.setContentType("text/html/jsp");
       // PrintWriter printWriter=response.getWriter();
      //  String result=BookName+BookWitter+BookOfYear+BookPages;
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<p> Book Name: "+BookName+"</p>");
        out.println("<br>");
        out.println("<p> Book Witter: "+BookWitter+"<p>");
        out.println("<br>");
        out.println("Book Issues years: "+BookOfYear);
        out.println("<br>");
        out.println("Book Pages: "+BookPages);
        out.println("<br>");
       // out.println("details of book: "+result);

        out.println("</body></html>");
        out.close();
        System.out.println("Book Name ::"+BookName);
        System.out.println(" Book Writter::"+BookWitter);
        System.out.println("Yearof issuses ::"+BookOfYear);
        System.out.println(" Pagesof book::)"+BookPages);}

public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
//    request.setAttribute("Book Name", request.getParameter("Book Name"));
//    request.setAttribute("Book Witter", request.getParameter("Book Witter"));
//    request.setAttribute("Book Issue Years", request.getParameter("Book Issue Year"));
//    request.setAttribute( "pages of Book", request.getParameter("Pages of Book"));
//
//    request.getRequestDispatcher("BookServelet/src/main/webapp/add").forward(request, response);

//    response.setContentType("text/html/jsp");
//    //  request.getRequestDispatcher("BookServelet/src/main/webapp/add.jsp").forward(request, response);
//    final String BookName=request.getParameter("Book Name");
//    final String BookWitter=request.getParameter("Book Witter");
//    final String BookOfYear=request.getParameter("Book Issue year");
//    final String BookPages=request.getParameter("Pages of Book");
//    String result=BookName+BookWitter+BookOfYear+BookPages;
//    PrintWriter out=response.getWriter();
//    out.println("Book Name: "+BookName+"/n");
//    out.println("Book Witter: "+BookWitter+"/n");
//    out.println("Book Issues years: "+BookOfYear+"/n");
//    out.println("Book Pages: "+BookPages+"/n");
//    out.println("details of book: "+result);
//    out.println("<html><body>");
//    out.println("</body></html>");

    }

    public void destroy() {
    }
}