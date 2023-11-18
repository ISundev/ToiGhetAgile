/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class STUDENTS {
    String masv,hoten,email,sodt,diachi,hinh;
    byte gioitinh;
    public STUDENTS() {
    }

    public STUDENTS(String masv, String hoten, String email, String sodt, String diachi, String hinh, byte gioitinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.email = email;
        this.sodt = sodt;
        this.diachi = diachi;
        this.hinh = hinh;
        this.gioitinh = gioitinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public byte getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(byte gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "STUDENTS{" + "masv=" + masv + ", hoten=" + hoten + ", email=" + email + ", sodt=" + sodt + ", diachi=" + diachi + ", hinh=" + hinh + ", gioitinh=" + gioitinh + '}';
    }

   
    
}
