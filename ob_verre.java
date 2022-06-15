/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegraphique;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author DELL
 */
public class ob_verre {

    int id;
    int indice_refraction;
    int dioptrie;
    String teinte;
    String traitment;
    String type;
    int prix;
    int contite;
    String image;
    
    void ob_verre(){}
    
    
    
    void ob_verre(int id,
            int indice_refraction,
    int dioptrie,
    String teinte,
    String traitment,
    String type,int prix,int contite,String image
   ){
        
    this.id=id;
    this.indice_refraction=indice_refraction;
    this.dioptrie=dioptrie;
    this.type=type;
    this.teinte=teinte;
    this.traitment=traitment;
    this.prix=prix;
    this.contite=contite;
    this.image=image;
    


    }
    
    
    
    
    
    
    

void Ajouter(
            String type,
            int indice_refraction,
            int dioptrie,
            String teinte,
            String traitment,
            int prix,
            int contite, String image
            ) {

        
        // variables
        Connection connection = null;
        Statement statement = null;
        

        // Step 1: Loading or registering MS Access JDBC driver class
         
        // Step 2: Opening database connection
        try {
            connection = MyConnection.getConnection();

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO verre (type,indice_refraction,dioptrie,teinte,traitement,prix,contite,image) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, type);
            stmt.setInt(2, indice_refraction);
            stmt.setInt(3, dioptrie);
            stmt.setString(4, teinte);
            stmt.setString(5, traitment);
            stmt.setInt(6, prix);
            stmt.setInt(7, contite);
            stmt.setString(8, image);
            

            stmt.executeUpdate();

            // processing returned data and printing into console
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {

            // Step 3: Closing database connection
            try {
                if (null != connection) {

                    // cleanup resources, once after processing
                    
                    statement.close();

                    // and then finally close connection
                    connection.close();
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }

    static void Afficher() {

        // variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // Step 1: Loading or registering MS Access JDBC driver class

        // Step 2: Opening database connection
        try {


            // Step 2.A: Create and get connection using DriverManager class
            connection = MyConnection.getConnection();

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            resultSet = statement.executeQuery("SELECT * FROM verre");

            System.out.println("ID\tName\t\t\tAge\tMatches");
            System.out.println("==\t================\t===\t=======");

            // processing returned data and printing into console
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t"
                        + resultSet.getString(2) + "\t"
                        + resultSet.getString(3) + "\t"
                        + resultSet.getString(4) + "\t"
                        + resultSet.getString(5) + "\t"
                        + resultSet.getString(6));
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

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            resultSet = statement.executeQuery("SELECT id,type,indice_refraction,dioptrie,teinte,traitement,prix,contite,image FROM verre");

            
            System.out.println("==\t================\t===\t=======");

            // processing returned data and printing into console
            while (resultSet.next()) {
                
                ob_verre ob=new ob_verre();
                
                
                
                
                
                ob.id=resultSet.getInt(1);
                ob.type=resultSet.getString(2) ;
                ob.indice_refraction=resultSet.getInt(3) ;
                ob.dioptrie=resultSet.getInt(4) ;
                ob.teinte=resultSet.getString(5) ;
                ob.traitment=resultSet.getString(6) ;
                ob.prix=resultSet.getInt(7);
                ob.contite=resultSet.getInt(8);
                ob.image=resultSet.getString(9) ;
                
                
                
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
    
    
    
    
    
    
    
    
    
    void Modiffier(int id,int indice_refraction,
            int dioptrie,
            String teinte,
            String traitment,
            String type,int prix,int contite,String image) {

        
        // variables
        Connection connection = null;
        Statement statement = null;
        

        // Step 1: Loading or registering MS Access JDBC driver class
        
        
        // Step 2: Opening database connection
        try {

            connection = MyConnection.getConnection();

            // Step 2.A: Create and get connection using DriverManager class
       

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            PreparedStatement stmt = connection.prepareStatement("update verre set indice_refraction=?, dioptrie=?,teinte=? ,traitment=?,type=?,prix=?,contite=?,image=? where id=?");

            stmt.setInt(1, indice_refraction);
            stmt.setInt(2, dioptrie);
            stmt.setString(3, teinte);
            stmt.setString(4, traitment);
            stmt.setString(5, type);
            stmt.setInt(6, prix);
            stmt.setInt(7, contite);
            stmt.setString(8, image);
            stmt.setInt(9, id);
            stmt.executeUpdate();

            // processing returned data and printing into console
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {

            // Step 3: Closing database connection
            try {
                if (null != connection) {

                    // cleanup resources, once after processing
                    
                    statement.close();

                    // and then finally close connection
                    connection.close();
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }

    
    
    
     void Modiffierob(){
     // variables
        Connection connection = null;
        Statement statement = null;
        

     

        // Step 2: Opening database connection
        try {

            
          connection = MyConnection.getConnection();

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            PreparedStatement stmt = connection.prepareStatement("update verre set type=?,indice_refraction=?, dioptrie=?,teinte=? ,traitement=?,prix=?,contite=?,image=? where id=?");
            stmt.setString(1, type);
            stmt.setInt(2, indice_refraction);
            stmt.setInt(3, dioptrie);
            stmt.setString(4, teinte);
            stmt.setString(5, traitment);
            stmt.setInt(6, prix);
            stmt.setInt(7, contite);
            stmt.setString(8, image);
            stmt.setInt(9, id);
            stmt.executeUpdate();

            // processing returned data and printing into console
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {

            // Step 3: Closing database connection
            try {
                if (null != connection) {

                    // cleanup resources, once after processing
                    
                    statement.close();

                    // and then finally close connection
                    connection.close();
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
     
     
     
     
     
     
     
     
     
     }
    
    void Supprimer(int id) {

        
        this.id = id;

        // variables
        Connection connection = null;
        Statement statement = null;
        

        // Step 1: Loading or registering MS Access JDBC driver class
        

        // Step 2: Opening database connection
        try {

            connection = MyConnection.getConnection();

            // Step 2.A: Create and get connection using DriverManager class
          

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            PreparedStatement stmt = connection.prepareStatement("delete from verre where id=?");

            stmt.setInt(1, id);
           

            stmt.executeUpdate();

            // processing returned data and printing into console
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {

            // Step 3: Closing database connection
            try {
                if (null != connection) {

                    // cleanup resources, once after processing
                    
                    statement.close();

                    // and then finally close connection
                    connection.close();
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }

}
