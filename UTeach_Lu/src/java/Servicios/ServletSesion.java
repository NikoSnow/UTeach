/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.DaoSesion;
import Modelo.Sesion;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luisa
 */
public class ServletSesion extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletSesion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletSesion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            System.out.println("xxx");
            ArrayList<Sesion> lista = null;
            //1. Crear instancia del DAO
            DaoSesion de;
        try {
            de = new DaoSesion();
        
            //Lista todos los elementos.
            lista = de.ListarSesion();
            //2. Envio de los datos por el request.
            request.setAttribute("sesion", lista);
            } catch (SQLException ex) {
            Logger.getLogger(ServletSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
            //3. RequestDispacher
            RequestDispatcher rd = request.getRequestDispatcher("Estudiante.jsp");
            rd.forward(request, response);
            
        
    }

    int idSesion=0;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        String tema = request.getParameter("temaSolicitud");
        String fecha = request.getParameter("fechaSolicitud");
        String[] hora1 = request.getParameter("HoraDe").split(":");
        String[] hora2 = request.getParameter("HoraHasta").split(":");
        
        String horas= request.getParameter("HoraDe");

        int hora22 = Integer.parseInt(hora2[0]);
        int hora11 = Integer.parseInt(hora1[0]);
        int cantidad=hora22-hora11;

        Usuario usu = new Usuario();
        Sesion sesion=new Sesion();
        sesion.setIdSesion(idSesion++);
        sesion.setTutor(usu);
        sesion.setPrecio(sesion.getPrecio()*cantidad);
        sesion.setCantidad(cantidad);
        sesion.setEstudiante(usu);
        sesion.setFecha(fecha);
        sesion.setTema(tema);
        sesion.setHora(horas);
        
        try {
            DaoSesion s = new DaoSesion();
            boolean resultado = s.insertarSesion(sesion);
            
        if (resultado == false) {
                request.setAttribute("insersion", "OK");
            } else {
                request.setAttribute("insersion", "NOK");
            } 
        } catch (SQLException ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        RequestDispatcher rd = request.getRequestDispatcher("Estudiante.jsp");
            rd.forward(request, response);  
    
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
