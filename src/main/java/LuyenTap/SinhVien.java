/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap;

/**
 *
 * @author vuvantu
 */
public class SinhVien extends Nguoi {

    private String maSV;
    
    private Double napTien;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String gioiTinh, String queQuan, String diaChi, String maSV, Double napTien) {
        super(hoTen, gioiTinh, queQuan, diaChi);
        this.maSV = maSV;
        this.napTien = napTien;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setNapTien(Double napTien) {
        this.napTien = napTien;
    }

    public Double getNapTien() {
        return napTien;
    }
}
