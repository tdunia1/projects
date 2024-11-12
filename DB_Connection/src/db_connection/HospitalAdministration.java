/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;
/**
 *
 * @author telmuun
 */
public class HospitalAdministration {
    
    // the main method will try to insert the data into db
    // check the db connection status
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        // using the db setup class we can check if the operation went ok
        if(DatabaSetup.setupDB() ){
            // if after we run the setupdb method all is ok
            // we have now created a db schem and created a table
            
            System.out.println("Database has been created successfully or already exists...");
        
        
        } else{
            // there is an issue connecting to the db or creating the schema
            System.out.println("There was a problem creating or connecting to the db... \n Please check db credentials");
            return;
        }
       
        // add
    
    
    }
    
    
    
    
}
