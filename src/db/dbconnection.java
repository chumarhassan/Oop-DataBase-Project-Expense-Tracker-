/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class dbconnection {
    public static Connection c;
    public static Statement st;
    static{
        try{
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingsentineldb"+"?useSSL=false","root","123456");
        st=c.createStatement();
        }
       
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}
}