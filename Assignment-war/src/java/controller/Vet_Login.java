/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Vets;
import model.VetsFacade;

/**
 *
 * 
 */
@WebServlet(name = "Vet_Login", urlPatterns = {"/Vet_Login"})
public class Vet_Login extends HttpServlet {

    @EJB
    private VetsFacade vetsFacade;

    
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
        
        String a = request.getParameter("username");
        String b = request.getParameter("password");
        HttpSession s = request.getSession();
        
        try (PrintWriter out = response.getWriter()) {
            try {
                Vets found = vetsFacade.find(a);
                if (found == null) {
                    throw new IllegalArgumentException("Invalid Username, please try again.");
                }
                if (!found.getPassword().equals(b)){
                    throw new IllegalArgumentException("Wrong Passowrd, please try again.");
                }
                s.setAttribute("vet",found);
                request.getRequestDispatcher("vet_HomePage.jsp").include(request, response);
            } catch (IllegalArgumentException e) {
                request.getRequestDispatcher("vet_Login.jsp").include(request, response);
                out.println("<br><br><br> Sorry " + a + ", " + e.getMessage());
            } catch (Exception e) {
                request.getRequestDispatcher("vet_Login.jsp").include(request, response);
                out.println("<br><br><br> Sorry " + a + ", an error occurred during registration: " + e.getMessage());
            }
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
