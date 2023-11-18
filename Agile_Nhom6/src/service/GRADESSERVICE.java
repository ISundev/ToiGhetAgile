/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.GRADES;
import model.STUDENTS;
import utility.DBContext;

/**
 *
 * @author admin
 */
public class GRADESSERVICE {

    Connection cn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    public List<GRADES> getAll() {
        List<GRADES> lg = new ArrayList<>();
        try {
            cn = DBContext.getConnection();
            String sql = "SELECT ID,GRADE.MASV,HOTEN,TIENGANH,TINHOC,GDTC FROM GRADE join STUDENTS on GRADE.MASV = STUDENTS.MASV";
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                GRADES g = new GRADES();

                g.setTensv(rs.getString(3));
                g.setId(rs.getInt("ID"));
                g.setMasv(rs.getString("MASV"));
                g.setTienganh(rs.getInt("TIENGANH"));
                g.setTinhoc(rs.getInt("TINHOC"));
                g.setGdtc(rs.getInt("GDTC"));
                lg.add(g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstm.close();
                cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return lg;
    }

    public Integer insert(GRADES g) {
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "INSERT INTO GRADE(MASV,TIENGANH,TINHOC,GDTC) VALUES(?,?,?,?)";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, g.getMasv());
            pstm.setInt(2, g.getTienganh());
            pstm.setInt(3, g.getTinhoc());
            pstm.setInt(4, g.getGdtc());
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

    public Integer update(GRADES g, int id) {
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "UPDATE GRADE set TIENGANH = ?,TINHOC = ? , GDTC=? where ID = ?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(4, id);
            pstm.setInt(1, g.getTienganh());
            pstm.setInt(2, g.getTinhoc());
            pstm.setInt(3, g.getGdtc());
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

    public Integer delete(int id) {
        Integer row = null;
        try {
            cn = DBContext.getConnection();
            String sql = "delete GRADE where ID = ?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, id);

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

    public int getID(String ma) {
        int id = 0;
        try {
            cn = DBContext.getConnection();
            String sql = "Select ID from GRADE where MASV like ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ma);
            rs = pstm.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");

            }
        } catch (Exception e) {
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

        return id;
    }

    public ArrayList<GRADES> timTheoMaSV(String Masv) {
        ArrayList<GRADES> list = new ArrayList<>();
        try {
            cn = DBContext.getConnection();
            String sql = "SELECT GRADE.MASV,HOTEN,TIENGANH,TINHOC,GDTC FROM GRADE join STUDENTS on GRADE.MASV = STUDENTS.MASV \n"
                    + "WHERE GRADE.MASV = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, Masv);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                GRADES d = new GRADES();
                d.setTensv(rs.getString("HOTEN"));
                d.setMasv(rs.getString("MASV"));
                d.setTensv(rs.getString("HOTEN"));
                d.setTienganh(rs.getInt("TIENGANH"));
                d.setTinhoc(rs.getInt("TINHOC"));
                d.setGdtc(rs.getInt("GDTC"));
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
