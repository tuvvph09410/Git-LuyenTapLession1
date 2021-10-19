/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap3;

import java.io.Serializable;

/**
 *
 * @author vuvantu
 */
public class Sach implements Serializable{
    private String maSach;
    private String tenSach;
    private int soLuong;
    private String tinhTrang;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, int soLuong, String tinhTrang) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
