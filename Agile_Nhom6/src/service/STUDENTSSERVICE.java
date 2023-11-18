/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.STUDENTS;
import utility.DBContext;
/**
 *
 * @author admin
 */
public class STUDENTSSERVICE {
    Connection cn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    public List<STUDENTS> getAll(){
        List<STUDENTS> ls = new ArrayList<>();
        try {
            cn = DBContext.getConnection();
            String sql = "SELECT * FROM STUDENTS";
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                STUDENTS s = new STUDENTS();
                s.setMasv(rs.getString(1));
                s.setHoten(rs.getString(2));
                s.setEmail(rs.getString(3));
                s.setSodt(rs.getString(4));
                s.setGioitinh(rs.getByte(5));
                s.setDiachi(rs.getString(6));
                s.setHinh(rs.getString(7));
                ls.add(s);
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
        
        return ls;
    }
    public Integer insert(STUDENTS s) {
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "INSERT INTO STUDENTS VALUES(?,?,?,?,?,?,?)";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, s.getMasv());
            pstm.setString(2, s.getHoten());
            pstm.setString(3, s.getEmail());
            pstm.setString(4, s.getSodt());
            pstm.setByte(5, s.getGioitinh());
            pstm.setString(6, s.getDiachi());
            pstm.setString(7, s.getHinh());
            row = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstm.close();
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }
    public Integer update(STUDENTS s) {
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "UPDATE STUDENTS set HOTEN = ?,EMAIL = ?,\n" +
"	SODT = ?,GIOITINH =?,DIACHI = ?,HINH = ? where MASV = ?";
            
            
            pstm = cn.prepareStatement(sql);
            
            pstm.setString(1, s.getHoten());
            pstm.setString(2, s.getEmail());
            pstm.setString(3, s.getSodt());
            pstm.setByte(4, s.getGioitinh());
            pstm.setString(5, s.getDiachi());
            pstm.setString(6, s.getHinh());
            pstm.setString(7, s.getMasv());
            row = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstm.close();
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }
    public Integer delete(String MASV) {
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "delete GRADE where MASV = ?\n" +
"delete STUDENTS where MASV = ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, MASV);
            pstm.setString(2, MASV);
            row = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstm.close();
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }

}
