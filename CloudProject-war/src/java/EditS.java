/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import StudentsCloud.StudentsFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(urlPatterns = {"/EditS"})
public class EditS extends HttpServlet {
    @EJB
    StudentsFacadeLocal s;
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
            out.println("<title>Servlet EditS</title>");            
            out.println("</head>");
            out.println("<body>");
           String en = request.getParameter("en");
           List<String> arr = new ArrayList<String>();
           arr=s.editDetails(en);
           out.println("Your orignal details are as follows<br>"
                   + "Enrolment " +arr.get(0)+"<br>"
                   +"Full Name"+arr.get(1)+"<br>"
                   +"User Name"+arr.get(2)+"<br>"
           );
           request.setAttribute("en", en);
           request.getRequestDispatcher("Edit.jsp").forward(request, response);
            /*out.println("Enter youyr new Details<br>");
            out.println("<form name='form1 action='Home.java'>"
                    + " New Full Name:<input type='text' name='fn'><br>"
                    + " New Enrolment:<input type='text' name='en'><br>"
                    + " New username:<input type='text' name='usr'><br>"
                    + " New Password:<input type='password' name='pw'<br>"
                    + " <button type='submit'>Change</button>"
                    + "</form> ");*/
            out.println("</body>");
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
