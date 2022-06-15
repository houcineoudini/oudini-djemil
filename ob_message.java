/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegraphique;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
/**
 *
 * @author DELL
 */
public class ob_message {
    int id;
    String name;
    String email;
    String message;
    
    
    void ob_message(){}
    
    
    
    void ob_message(int id,
            String name,
    String email,
    String message ){
        
    this.id=id;
    this.name=name;
    this.email=email;
    this.message=message;
    }
    
    
    static Vector AfficherOb() {

      Vector v=new Vector();
        // variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // Step 1: Loading or registering MS Access JDBC driver class
        

        // Step 2: Opening database connection
        try {

            connection = MyConnection.getConnection();

            // Step 2.A: Create and get connection using DriverManager class
            

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            resultSet = statement.executeQuery("SELECT id,name,email,message FROM registrations");

            
            System.out.println("==\t================\t===\t=======");

            // processing returned data and printing into console
            while (resultSet.next()) {
                
                ob_message ob=new ob_message();
                
                
                
                
               //"id","Dioptrie", "Rayon", "Diametre", "Couleur","Marque","Prix","Quantité" 
                ob.id=resultSet.getInt(1);
                ob.name=resultSet.getString(2) ;
                ob.email=resultSet.getString(3) ;
                ob.message=resultSet.getString(4) ;           
                v.addElement(ob);
                
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {

            // Step 3: Closing database connection
            try {
                if (null != connection) {

                    // cleanup resources, once after processing
                    resultSet.close();
                    statement.close();

                    // and then finally close connection
                    connection.close();
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
        return v;
    }      
    
}
