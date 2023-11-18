/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class GRADES {
    String masv,tensv;
    int id,tienganh,tinhoc,gdtc;

    public GRADES() {
    }

    public GRADES(String masv, String tensv, int id, int tienganh, int tinhoc, int gdtc) {
        this.masv = masv;
        this.tensv = tensv;
        this.id = id;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTienganh() {
        return tienganh;
    }

    public void setTienganh(int tienganh) {
        this.tienganh = tienganh;
    }

    public int getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(int tinhoc) {
        this.tinhoc = tinhoc;
    }

    public int getGdtc() {
        return gdtc;
    }

    public void setGdtc(int gdtc) {
        this.gdtc = gdtc;
    }

    
    public double getDiemTb() {
        return (this.tienganh + this.tinhoc + this.getGdtc())/3;
    }
    
    
}
