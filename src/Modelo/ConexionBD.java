package Modelo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionBD {
    public String nombreBD = "fabrica";
    public String usuario = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    
    public ConexionBD(){
        
    }
    
       public com.mysql.jdbc.Connection conectar(){
        com.mysql.jdbc.Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.url, this.usuario, this.password);
            System.out.println("conectado con exito");
            
        } catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }
    
    
}
