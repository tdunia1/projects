/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package db_connection;

/**
 *
 * @author telmuun
 */
public abstract class DB_Connection {
// this is the database connection information, all of our database information used to perform CRUD operations will rely on this connection

protected final static String DB_BASE_URL = "jdbc:mysql://localhost";
protected final static String USER = "root";
protected final static String PASSWORD = "password";
// this schema name may or may not be created
protected final static String DB_NAME = "hospital";
protected final static String TABLE = "patient_data";

// now we create the final database URL with the schema name
protected final static String DB_URL = DB_BASE_URL + "/" + DB_NAME;


    
    
    
    
    
}
