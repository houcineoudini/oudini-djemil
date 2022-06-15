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
public class ob_achat {
    int id;
    int id_produit;
    int id_fournisseur;
    int date_achat;
    int prix_achat;
    int contite_achat;
    
void ob_achat(){}


 void ob_achat(int id,
    int id_produit,
    int id_fournisseur,
    int date_achat,
    int prix_achat,
    int contite_achat){
        
    this.id=id;
    this.id_produit=id_produit;
    this.id_fournisseur=id_fournisseur;
    this.date_achat=date_achat;
    this.prix_achat=prix_achat;
    this.contite_achat=contite_achat;
    }
}
