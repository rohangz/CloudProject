/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import StudentsCloud.FridayFacadeLocal;
import StudentsCloud.MondayFacadeLocal;
import StudentsCloud.TeachersFacadeLocal;
import StudentsCloud.ThursdayFacadeLocal;
import StudentsCloud.TuesdayFacadeLocal;
import StudentsCloud.WednesdayFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns = {"/JIITS"})
public class JIITS extends HttpServlet {
    @EJB
    MondayFacadeLocal mon;
    @EJB
    TuesdayFacadeLocal tue;
    @EJB
    WednesdayFacadeLocal wed;
    @EJB
    ThursdayFacadeLocal thu;
    @EJB
    FridayFacadeLocal fri;
    @EJB
    TeachersFacadeLocal teachers;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JIITS</title>");            
            out.println("</head>");
            out.println("<body><center>");
            String tName = request.getParameter("fname");
            out.println(tName);
            String day = request.getParameter("day");
            List<String> ids = teachers.search(tName);
            for(int i=0;i<ids.size();++i)
            {
                out.println("<h1>"+ ids.get(i) +"</h1>");
            }
            if(day.equalsIgnoreCase("Monday"))
            {
             List<String> arr = mon.searchMe(ids.get(0));
             
             out.println("<table border='3' padding='4'><tr>"
                     + "<td>"+"Faculty"
                     + "</td>"
                     + "<td>9-10"
                     + "</td>"
                     + "<td>10-11"
                     + "</td>"
                     +"<td>11-12"
                     + "</td>"
                     + "</tr>"
                     + "<td>"+tName
                     + "</td>"
                     + "<td>"+arr.get(1)
                     + "</td>"
                     + "<td>"+arr.get(2)
                     + "</td>"
                     +"<td>"+arr.get(3)
                     + "</td>"
                     + "</tr></table>");
            }
            else   if(day.equalsIgnoreCase("Tuesday"))
            {
                 List<String> arr = tue.searchMe(ids.get(0));
             
             out.println("<table border='3' padding='4'><tr>"
                     + "<td>"+"Faculty"
                     + "</td>"
                     + "<td>9-10"
                     + "</td>"
                     + "<td>10-11"
                     + "</td>"
                     +"<td>11-12"
                     + "</td>"
                     + "</tr>"
                     + "<td>"+tName
                     + "</td>"
                     + "<td>"+arr.get(1)
                     + "</td>"
                     + "<td>"+arr.get(2)
                     + "</td>"
                     +"<td>"+arr.get(3)
                     + "</td>"
                     + "</tr></table>");
                
            }
            else   if(day.equalsIgnoreCase("Wednesday"))
            {
                 List<String> arr = wed.searchMe(ids.get(0));
             
             out.println("<table border='3' padding='4'><tr>"
                     + "<td>"+"Faculty"
                     + "</td>"
                     + "<td>9-10"
                     + "</td>"
                     + "<td>10-11"
                     + "</td>"
                     +"<td>11-12"
                     + "</td>"
                     + "</tr>"
                     + "<td>"+tName
                     + "</td>"
                     + "<td>"+arr.get(1)
                     + "</td>"
                     + "<td>"+arr.get(2)
                     + "</td>"
                     +"<td>"+arr.get(3)
                     + "</td>"
                     + "</tr></table>");
            }
            else   if(day.equalsIgnoreCase("Thursday"))
            {
                 List<String> arr = thu.searchMe(ids.get(0));
             
             out.println("<table border='3' padding='4'><tr>"
                     + "<td>"+"Faculty"
                     + "</td>"
                     + "<td>9-10"
                     + "</td>"
                     + "<td>10-11"
                     + "</td>"
                     +"<td>11-12"
                     + "</td>"
                     + "</tr>"
                     + "<td>"+tName
                     + "</td>"
                     + "<td>"+arr.get(1)
                     + "</td>"
                     + "<td>"+arr.get(2)
                     + "</td>"
                     +"<td>"+arr.get(3)
                     + "</td>"
                     + "</tr></table>");
            }
            else if(day.equalsIgnoreCase("Friday"))
            {
                 List<String> arr = fri.searchMe(ids.get(0));
             
             out.println("<table border='3' padding='4'><tr>"
                     + "<td>"+"Faculty"
                     + "</td>"
                     + "<td>9-10"
                     + "</td>"
                     + "<td>10-11"
                     + "</td>"
                     +"<td>11-12"
                     + "</td>"
                     + "</tr>"
                     + "<td>"+tName
                     + "</td>"
                     + "<td>"+arr.get(1)
                     + "</td>"
                     + "<td>"+arr.get(2)
                     + "</td>"
                     +"<td>"+arr.get(3)
                     + "</td>"
                     + "</tr></table>");
            }
            
          out.println("<br><form name='form1' action=''><button type='submit'>Click here to visit college</button></form>");
          out.println("<br><form name='form1' action='Login.jsp'><button type='submit'>Click here to go back to login page</button></form>");
         //   out.println("<h1>List " + "Hello world" + "</h1>");
            out.println("</center></body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
