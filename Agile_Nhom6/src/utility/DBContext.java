/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DBContext {
    public static String USER = "sa";
    public static String PASSWORD = "12345678";
       
    public static String URL = "jdbc:sqlserver://localhost:1433;databaseName=ASMJAVA3;username=sa;password=123;";
    static{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static Connection getConnection(){
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    public static void main(String[] args) {
        Connection cn = getConnection();
        if(cn!=null){
            System.out.println("Ket noi thanh cong");
        }else{
            System.out.println("Loi ket noi");
        }
    }
}
