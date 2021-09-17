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
    private int tienTrongVi;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String gioiTinh, String queQuan, String diaChi,String maSV, int tienTrongVi) {
        super(hoTen, gioiTinh, queQuan, diaChi);
           this.maSV = maSV;
        this.tienTrongVi = tienTrongVi;
    }


    public String getMaSV() {
        return maSV;
    }

    public void napTien(int napTien) {
        this.tienTrongVi += napTien;
    }

    public void trutien(int truTien) {
        this.tienTrongVi -= truTien;
    }

    @Override
    public String getThongTin() {
        String getThongTin = super.getThongTin() + " - " + this.maSV + " - " + this.tienTrongVi;
        return getThongTin;
    }

    public String getThongTin(String chuyenNghanh) {
        String getThongTin = this.maSV + " - chuyên nghành - " + this.tienTrongVi;
        return getThongTin;
    }

}
