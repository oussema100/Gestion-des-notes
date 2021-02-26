package Connecter;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Connecter {
    Connection conn;
    public Connecter(){
        try {
            Class.forName("com.mysqljdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
         try{
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/");
}catch(SQLException e){ 
 
      System.err.println(e);
    }
   
}
    Connection obtenirconnexion(){
        return conn;
    }
}
