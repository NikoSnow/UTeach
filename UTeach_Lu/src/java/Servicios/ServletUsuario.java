/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.DaoUsuario;
import Modelo.Usuario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.Random;
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
public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        try {
            String correo = request.getParameter("correo");
            String contrasena = request.getParameter("contrasena");
            DaoUsuario u = new DaoUsuario();
            
            int resultado=u.autenticacion(correo, contrasena);
            
           if (resultado==1) {
                response.sendRedirect("Estudiante.jsp");
            }
           if (resultado == 2) {
                response.sendRedirect("Tutor.jsp");  
            }
            if (resultado ==3) {
                System.out.println("ENTREEEEEEEEEEEEEEEEEEEEEEEE");
                response.sendRedirect("index.html");   
            
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
      int id=0;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
           
//            String correo = request.getParameter("correo");
//            String contraseña = request.getParameter("contrasena");
//            String nombre = request.getParameter("nombre");            
//            String programa = request.getParameter("programa");
//            String semestre= request.getParameter("semestre");
//            String tipo =(request.getParameter("tipo"));
//            double calificacion =0;             
//    
//        Usuario usu = new Usuario();
//        
//        usu.setCorreo(correo);
//        usu.setContrasena(contraseña);
//        usu.setNombre(nombre);
//        usu.setPrograma(programa);
//        usu.setSemestre(Integer.parseInt(semestre));
//        usu.setTipo(Integer.parseInt(tipo));
//        usu.setId(id++);
//
//        DaoUsuario u;
//        try {
//            u = new DaoUsuario();
//           
//            boolean resultado = u.insertarUsuario(usu);
//            if (resultado == false) {
//                request.setAttribute("insersion", "OK");
//            } else {
//                request.setAttribute("insersion", "NOK");
//            } 
//        } catch (SQLException ex) {
//            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
//        }
       

      
         response.setHeader("Access-Control-Allow-Origin", "*");
         JsonObject myObj = new JsonObject();
         myObj.addProperty("correo", "nicolas.gomezo");
         PrintWriter out = response.getWriter();
            DaoUsuario dao = null;
            
        try { 
            dao = new DaoUsuario();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         Usuario user = new Usuario();
//         user.setNombre("Niko");
//         user.setCorreo("niko.cannavaro");
//         user.setContrasena("1234");
//         user.setPrograma("inge");
         Gson gson = new GsonBuilder().create();
         String s = gson.toJson(dao.listarUsuario());
         out.println(s);

    
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
