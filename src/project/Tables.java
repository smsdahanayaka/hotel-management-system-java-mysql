/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */

/*CREATE DATA BASE TABLE*/
public class Tables {
    public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            //WRITE QUARY FOR CREATE DATABASE TABLE
            st.executeUpdate("CREATE TABLE IF NOT EXISTS user (name VARCHAR(200),email VARCHAR(200),password VARCHAR(50),securityQuestion VARCHAR(500),answer VARCHAR(200),address VARCHAR(200),status VARCHAR(20)) ");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS room(roomNo VARCHAR(10),roomType VARCHAR(50),bed VARCHAR(100),price VARCHAR(100),status VARCHAR(50))");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS customer(id INT,name VARCHAR(50),mobileNumber VARCHAR(100),nationality VARCHAR(100),gender VARCHAR(50),email VARCHAR(200),idProof VARCHAR(200),address VARCHAR(200),checkIn VARCHAR(50),roomNo VARCHAR(10),bed VARCHAR(200),roomType VARCHAR(200),pricePerDay int,numberOfDaysStay INT,totalAmount VARCHAR(200),checkout VARCHAR(200))");
            
            JOptionPane.showMessageDialog(null, "Table create sucess");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                con.close();
                st.close();
             }
            catch(Exception e){
        
             }
        
        }
    }
}
