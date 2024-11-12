/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

/**
 *
 * @author telmuun
 */
public class Patient {
    // this patient information will utilized by te system to add or retreive patient data from the hospital db
    
    // attributes
    private String name;
    private String birthDate;
    private String bloodType;
    private int patientID;
    
    
    // static attribute
    // static attributes are a class variable
    // it will be shared by all the objects within the class
    // currentId this will be used to generate new ID values to patients and check current ids 
    
    private static int currentID = 1;
    // create 2 constructors
    // one constructor will be the patient data
    public Patient(String name, String birthDate,String bloodType){
        this.name = name;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.patientID = currentID; // static attribute value 1
        currentID++; // value 2
        
        System.out.println(name + " has a birthday on " + birthDate);
    }
    // constructor 2 will be when adding a patient to the db
    public Patient(String name, String birthDate, String bloodType, int patientID){
        // add a patient with an ID
        this.name = name;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.patientID = patientID;
        
        if (currentID <= patientID){ // current id = 2
            currentID = patientID +1; // this will increment the current ID
        }
    }
    
    
    // getters and setters

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getPatientID() {
        return patientID;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public static void setCurrentID(int currentID) {
        Patient.currentID = currentID;
    }
    
    
    
    
    
}
