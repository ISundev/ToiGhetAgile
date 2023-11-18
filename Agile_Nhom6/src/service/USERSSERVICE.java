/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import model.USERS;
import utility.DBContext;
/**
 *
 * @author admin
 */
public class USERSSERVICE {
    Connection cn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public USERS getLogin(String username){
        USERS us = new USERS();
        try {
            cn = DBContext.getConnection();
            String sql = "SELECT * FROM USERS WHERE USERNAME = ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, username);
            rs = pstm.executeQuery();
            while (rs.next()) {
                us.setUsername(rs.getString("USERNAME"));
                us.setPassword(rs.getString("PASSWORD"));
                us.setRole(rs.getString("ROLE"));
                return us;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstm.close();
                cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    public boolean checkLogin(String username,String password){
        USERS us = getLogin(username);
        if(us!=null){
            if(us.getPassword().equals(password)){
                return true;
            }
        }
        return false;        
    }
    
}
