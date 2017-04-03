package DAO;

import Modelo.Sesion;
import Modelo.Tutoria;
import Modelo.Usuario;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public class DaoSesion {
    
    private Connection conexion;
    
    public DaoSesion() throws SQLException{
        Conexion dt = Conexion.getConexion();
        this.conexion = dt.getConnection();
    }
    
    public boolean insertarSesion(Sesion sesion){
        boolean resultado = false;
        try {//!.Establecer la consulta
        String consulta="INSERT INTO TUTORIASESION VALUES(?,?,?,?,?,?,?,?)";
        //2.Crear el prepareStament
          PreparedStatement statement;
          statement=this.conexion.prepareStatement(consulta);
        //-------------------------------------------------
            statement.setInt(1,sesion.getIdSesion());
            statement.setInt(2, sesion.getTutor().getId());
            statement.setInt(3, sesion.getEstudiante().getId());
            statement.setString(4, sesion.getHora());
            statement.setString(5, sesion.getTema());
            statement.setString(6, sesion.getFecha());
            statement.setInt(7, sesion.getPrecio());
            statement.setInt(8, sesion.getCantidad());
          
        //3.Hacer la ejecucion
        resultado=statement.execute();
        
            
  }catch(SQLException ex){
        ex.printStackTrace();
    }
        return resultado;
}
    public boolean insertarTutoria(Tutoria tutoria){
        boolean resultado = false;
        try {
            
            
        } catch (Exception e) {
        }return resultado;
    }
    
    public ArrayList<Sesion> ListarSesion(){
      //1. Consulta
       ArrayList<Sesion> respuesta= new ArrayList();
       String consulta= "SELECT * FROM TUTORIASESION";
       try{
       //2.Statement
       Statement statement=this.conexion.createStatement();
       //3.Ejecucion
       ResultSet resultado =statement.executeQuery(consulta);
       
       //Recorrido sobre el resultado
       while(resultado.next()){
            
          Sesion s=new Sesion();
          
          s.setTema(resultado.getString("tema"));
          s.setFecha(resultado.getString("fecha"));
          s.setPrecio(resultado.getInt("precio"));
          s.setHora(resultado.getString("Horas"));
          respuesta.add(s);
           
       }
   }catch(SQLException ex){
        ex.printStackTrace();
   } 
       return respuesta;
}   
}
