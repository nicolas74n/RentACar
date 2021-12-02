/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Nico
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectDB {
   
    private final String base="nico";
    private final String user="nico";
    private final String password="1831";
    private final String url="jdbc:mysql://186.21.135.183:3306/"+base;
    private Connection con=null;
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,password);
//            JOptionPane.showMessageDialog(null, "Conectado");
            
        }catch(SQLException e){
            System.err.print(e);
            JOptionPane.showMessageDialog(null, "Error!", "Advertencia", JOptionPane.ERROR);
            
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "Error!", "Advertencia", JOptionPane.ERROR);
        }
        return con;
    }
}
