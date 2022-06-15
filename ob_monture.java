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
public class ob_monture {
    int id;
    String reference;
    String couleur;
    String type;
    int taille_A;
    int taille_pont;
    int taille_bras;
    int prix;
    int contite;
    String image;
    
    void ob_monture(){}
    
    
    
    void ob_monture(int id,
            String type,
    String reference,
    String couleur,
    int taille_A,
    int taille_pont,
    int taille_bras, int prix, int contite,String image){
        
    this.id=id;
    this.type=type;
    this.reference=reference;
    this.couleur=couleur;
    this.taille_A=taille_A;
    this.taille_pont=taille_pont;
    this.taille_bras=taille_bras;
    this.prix=prix;
    this.contite=contite;
    this.image=image;
    
        
    }
    
    
    
    
void Ajouter(String reference,
    String couleur,
    String type,
    int taille_A,
    int taille_pont,
    int taille_bras,
    int prix, int contite,String image) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = MyConnection.getConnection();
            statement = connection.createStatement();
            PreparedStatement stmt = connection.prepareStatement
            ("INSERT INTO monture(type,reference,taille_A, taille_pont ,taille_bras,couleur,prix,contite,image) VALUES (?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, type);
            stmt.setString(2, reference);
            stmt.setInt(3, taille_A);
            stmt.setInt(4, taille_pont);
            stmt.setInt(5, taille_bras);
            stmt.setString(6, couleur);
            stmt.setInt(7, prix);
            stmt.setInt(8, contite);
            stmt.setString(9, image);
            stmt.executeUpdate();
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {
            try {
                if (null != connection) {
                    statement.close();
                    connection.close();
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }
 static void Afficher() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = MyConnection.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM monture");

            
            System.out.println("==\t================\t===\t=======");

            // processing returned data and printing into console
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t"
                        + resultSet.getString(2) + "\t"
                        + resultSet.getString(3) + "\t"
                        + resultSet.getString(4) + "\t"
                        + resultSet.getString(5) + "\t"
                        + resultSet.getString(6) + "\t"
                        + resultSet.getString(7));
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
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = MyConnection.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM monture");
            System.out.println("==\t================\t===\t=======");
            while (resultSet.next()) {
                ob_monture ob=new ob_monture();
                ob.id=resultSet.getInt(1);
                ob.type=resultSet.getString(2) ;
                ob.reference=resultSet.getString(3) ;
                ob.taille_A=resultSet.getInt(4) ;
                ob.taille_pont=resultSet.getInt(5) ;
                ob.taille_bras=resultSet.getInt(6) ;
                ob.couleur=resultSet.getString(7) ;
                ob.prix=resultSet.getInt(8) ;
                ob.contite=resultSet.getInt(9) ;
                ob.image=resultSet.getString(10) ;
                v.addElement(ob);
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {
            try {
                if (null != connection) {
                    resultSet.close();
                    statement.close();
                    connection.close();
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        } return v;
    }    
    
 void Modiffier(int id,
            String reference,
            String type,
            String couleur,
            int taille_A,
            int taille_pont,int taille_bras,int prix,int contite,String image){

        
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
            PreparedStatement stmt = connection.prepareStatement("update monture set reference=?, type=?,couleur=? ,taille_A=?,taille_pont=?,taille_bras=? where id=?");

            stmt.setString(1, reference);
            stmt.setString(2, type);
            stmt.setString(3, couleur);
            stmt.setInt(4, taille_A);
            stmt.setInt(5, taille_pont);
            stmt.setInt(6, taille_bras);
            stmt.setInt(7, id);
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
            PreparedStatement stmt = connection.prepareStatement("update monture set reference=?, type=?,couleur=? ,taille_A=?,taille_pont=?,taille_bras=?,prix=?,contite=?,image=? where id=?");

            stmt.setString(1, reference);
            stmt.setString(2, type);
            stmt.setString(3, couleur);
            stmt.setInt(4, taille_A);
            stmt.setInt(5, taille_pont);
            stmt.setInt(6, taille_bras);
            stmt.setInt(7, prix);
            stmt.setInt(8, contite);
            stmt.setString(9, image);
            stmt.setInt(10, id);
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
        

       
        

        // Step 2: Opening database connection
        try {
            
connection = MyConnection.getConnection();

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            PreparedStatement stmt = connection.prepareStatement("delete from monture where id=?");

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
