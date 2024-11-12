/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;
// static objects
import static db_connection.DB_Connection.DB_URL;
import static db_connection.DB_Connection.USER;
import static db_connection.DB_Connection.PASSWORD;
import static db_connection.DB_Connection.TABLE;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;

/**
 *
 * @author telmuun
 */
public class DatabaseWriter {
    
    // this method will write information to the database
    
    public boolean addPatient(Patient patient){
       // the patiet instance == (name, birthdate, bloodtype, id)
       try(
               Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
               Statement stmt = conn.createStatement();
               ){
                    
                    String sql = String.format("INSERT INTO " + TABLE + " VALUES ("
                    + "'%s', '%s', '%s', %d);",
                            patient.getName(),
                            patient.getBirthDate(),
                            patient.getBloodType(),
                            patient.getPatientID()
                    );
                stmt.execute(sql);
                return true;
       
       
       }catch(Exception e){
           e.printStackTrace();
           return false;
       }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
