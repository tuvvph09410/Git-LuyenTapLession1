/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap2;

import java.io.Serializable;

/**
 *
 * @author vuvantu
 */
public class Product implements Serializable{
    private String nameSP;
    private String maSP;
    private String danhMuc;
    private String trangThai;
    private Double donGia;

    public Product() {
    }

    public Product(String nameSP, String maSP, String danhMuc, String trangThai, Double donGia) {
        this.nameSP = nameSP;
        this.maSP = maSP;
        this.danhMuc = danhMuc;
        this.trangThai = trangThai;
        this.donGia = donGia;
    }

    public String getNameSP() {
        return nameSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    
}
