/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap;

import java.io.Serializable;

/**
 *
 * @author vuvantu
 */
public class Nguoi implements Serializable{

    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String gioiTinh, String queQuan, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThongTin() {
        String thongTin = this.hoTen + " - " + this.gioiTinh + " - " + this.diaChi + " - " + this.queQuan;
        return thongTin;
    }
}
