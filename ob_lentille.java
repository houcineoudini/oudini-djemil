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
public class ob_lentille {
    int id;
    int dioptrie;
    int rayon;
    int diametre;
    String couleur;
    String marque_labo;
    int prix;
    int contite;
    String image;

    void ob_lentille(){}
    
    
    
    void ob_lentille(int id,
    int dioptrie,
    int rayon,
    int diametre,
    String couleur,
    String marque_labo,
    int prix,
    int contite,String image){
        
    this.id=id;
    this.dioptrie=dioptrie;
    this.rayon=rayon;
    this.couleur=couleur;
    this.marque_labo=marque_labo;
    this.prix=prix;
    this.contite=contite;  
    this.image=image; 
    }
    
    
    
    
    
    void Ajouter(int dioptrie,
    int rayon,
    int diametre,
    String couleur,
    String marque_labo, int prix,int contite,String image) {

        
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
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO lentilles (dioptrie,rayon ,diametre ,couleur, marque_labo,prix,contite,image) VALUES (?,?, ?, ?,?,?,?,?)");

            stmt.setInt(1, dioptrie);
            stmt.setInt(2, rayon);
            stmt.setInt(3, diametre);
            stmt.setString(4, couleur);
            stmt.setString(5, marque_labo);
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

            
            connection = MyConnection.getConnection();
            // Step 2.A: Create and get connection using DriverManager class
            
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            resultSet = statement.executeQuery("SELECT * FROM lentilles");

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

            // Step 2.A: Create and get connection using DriverManager class
            

            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            resultSet = statement.executeQuery("SELECT id,dioptrie,rayon,diametre,couleur,marque_labo,prix,contite,image FROM lentilles");

            
            System.out.println("==\t================\t===\t=======");

            // processing returned data and printing into console
            while (resultSet.next()) {
                
                ob_lentille ob=new ob_lentille();
                
                
                
                
               //"id","Dioptrie", "Rayon", "Diametre", "Couleur","Marque","Prix","Quantité" 
                ob.id=resultSet.getInt(1);
                ob.dioptrie=resultSet.getInt(2) ;
                ob.rayon=resultSet.getInt(3) ;
                ob.diametre=resultSet.getInt(4) ;
                ob.couleur=resultSet.getString(5) ;
                ob.marque_labo=resultSet.getString(6) ;
                ob.prix=resultSet.getInt(7) ;
                ob.contite=resultSet.getInt(8) ;
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
  void Modiffier(int id,
          int dioptrie,
        int rayon,
        int diametre,
        String couleur,
        String marque_labo,int prix,int contite,String image) {

        
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
            PreparedStatement stmt = connection.prepareStatement("update lentilles set dioptrie=?, rayon=?,diametre=? ,couleur=?,marque_labo=?,prix=?,contit=?,image=? where id=?");

            stmt.setInt(1, dioptrie);
            stmt.setInt(2, rayon);
            stmt.setInt(3, diametre);
            stmt.setString(4, couleur);
            stmt.setString(5, marque_labo);
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
    
 
  
 void ModiffierOb(){
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
            PreparedStatement stmt = connection.prepareStatement("update lentilles set dioptrie=?, rayon=?,diametre=? ,couleur=?,marque_labo=?,prix=?,contite=?,image=? where id=?");

            stmt.setInt(1, dioptrie);
            stmt.setInt(2, rayon);
            stmt.setInt(3, diametre);
            stmt.setString(4, couleur);
            stmt.setString(5, marque_labo);
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
            PreparedStatement stmt = connection.prepareStatement("delete from lentilles where id=?");

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
