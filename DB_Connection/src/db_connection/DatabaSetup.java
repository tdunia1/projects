/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author telmuun
 */
public class DatabaSetup extends DB_Connection{
    // once extended we can make use of the db information and create some logic to process the db creation
    
    // create a method to setup the connection
        public static boolean setupDB() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
            // any crud operation on the db couple of things can go wrong
            // the driver we have will manage the connection and make sure there is server feedback to the client
            
                // create an instance of the driver class 
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                
                // try to connect to the database
                try(
                        Connection conn = DriverManager.getConnection(DB_BASE_URL, USER, PASSWORD);
                        Statement stmt = conn.createStatement();
                        ){
                        // this is the query or the statement.
                        // check if we have the db and otherwise create it
                        stmt.execute("CREATE DATABASE IF NOT EXISTS " + DB_NAME + ";");
                        // query the db using the USE keyword
                        stmt.execute("USE " + DB_NAME + ";"); // database schema pointer
                        // create a query to insert into the database
                        String sql = 
                                // CREATE TABLE IF NOT EXISTS patient_data name VARCHAR(255)
                                "CREATE TABLE IF NOT EXISTS " + TABLE + "("
                                + "name VARCHAR(255),"
                                + "birthdata DATE,"
                                + "bloodType VARCHAR(3),"
                                + "id INT(10)"
                                +");";
                        // take this query and execute it
                        stmt.execute(sql);
                        return true;
                
                }catch(Exception e){
                    e.printStackTrace();
                    return false;                
                }
        
        
        
        
        
        
        }
            
    
    // create some logic to ensure we do not run into issues with the db connection
    
    
    
    
    
    
}
