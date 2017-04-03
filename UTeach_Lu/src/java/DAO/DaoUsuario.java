package DAO;

import Modelo.Usuario;
import Util.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.sql.ResultSet;
import java.util.ArrayList;
import static javax.ws.rs.core.Response.status;

/**
 *
 * @author Nico
 */
public class DaoUsuario {
    
    private Connection conexion;
    public DaoUsuario() throws SQLException{
        Conexion de = Conexion.getConexion();
        this.conexion = de.getConnection();
        
    }
    
    public boolean insertarUsuario(Usuario usuario){
        boolean resultado = false;
        try {//!.Establecer la consulta
        String consulta="INSERT INTO USUARIO VALUES(?,?,?,?,?,?,?)";
        //2.Crear el prepareStament
          PreparedStatement statement;
          statement=this.conexion.prepareStatement(consulta);
        //-------------------------------------------------
            statement.setInt(1, usuario.getId());
            statement.setString(2, usuario.getCorreo());
            statement.setString(3, usuario.getContrasena());
            statement.setString(4, usuario.getNombre());
            statement.setString(5, usuario.getPrograma());
            statement.setInt(6, usuario.getSemestre());
            statement.setInt(7, usuario.getTipo());
          //-----------------------------------------------
          
        //3.Hacer la ejecucion
        resultado=statement.execute();
        
            
  }catch(SQLException ex){
        ex.printStackTrace();
    }
        return resultado;
}
  public int autenticacion(String correo, String contraseña) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
            String query;
            String bdcorreo, bdcontraseña;
            int bdtipo;
            int login=0;
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/uteach","root","root");
            Statement stmt=(Statement) con.createStatement();
            query="SELECT correo, contraseña, tipo FROM Usuario;";
            stmt.executeQuery(query);
            ResultSet rs=stmt.getResultSet();
            
        while(rs.next()){
                bdcorreo = rs.getString("correo");
                bdcontraseña = rs.getString("contraseña");
                bdtipo =rs.getInt("tipo");
                
                if((bdcorreo.equals(correo) && bdcontraseña.equals(contraseña))&&(bdtipo==1)){
                    System.out.println("OK ESTUDIANTE");
                    login = 1;
                }else if((bdcorreo.equals(correo) && bdcontraseña.equals(contraseña))&&(bdtipo==2)){
                    System.out.println("OK TUTOR");
                    login = 2;
                }else if((bdcorreo!=(correo) && bdcontraseña!=(contraseña))){
                    System.out.println("NOK");
                    login=3;
            }
            System.out.println(login);
        }
        return login;    
    }  
//    
    public ArrayList<Usuario> listarUsuario(){

            ArrayList<Usuario> respuesta = new ArrayList();
            String consulta = "SELECT * FROM USUARIO";
            try {
                Statement statement = this.conexion.createStatement();
                ResultSet result = statement.executeQuery(consulta);

                while(result.next()){
                    Usuario usuario=new Usuario();
                        
                    usuario.setId((result.getInt(1)));
                    usuario.setCorreo((result.getString(2)));
                    usuario.setContrasena(result.getString(3));
                    usuario.setNombre(result.getString(4));
                    usuario.setPrograma(result.getString(5));
                    usuario.setSemestre(result.getInt(6));
                    usuario.setTipo(result.getInt(7));
                    System.out.println(usuario);
                    respuesta.add(usuario);

                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return respuesta;
        }
    }

