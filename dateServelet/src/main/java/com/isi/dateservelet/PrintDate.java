/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.dateservelet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author isi
 */
@WebServlet(name = "PrintDate", urlPatterns = {"/printdate"})
public class PrintDate extends HttpServlet{
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.addHeader("Refresh", "5");
          Date date1 = new Date();
          SimpleDateFormat df = new SimpleDateFormat("yy/mm/dd hh:mm:ss");
          Calendar cal = Calendar.getInstance();
          Date date2 = cal.getTime();
          
           try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BourseController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>(Date) Nous sommes le : " + date1 + "</h3>");
            out.println("<h3>(Calendar) Nous sommes le : " + df.format(date2) + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
}
