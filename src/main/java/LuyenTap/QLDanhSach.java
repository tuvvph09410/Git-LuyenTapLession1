/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap;

import java.util.ArrayList;

/**
 *
 * @author vuvantu
 */
public class QLDanhSach implements QLDanhSachInterface{
    private ArrayList<Nguoi> arrayListNguoi;

    public QLDanhSach() {
        this.arrayListNguoi=new ArrayList<>();
    }

    public QLDanhSach(ArrayList<Nguoi> arrayListNguoi) {
        this.arrayListNguoi = arrayListNguoi;
    }

    @Override
    public void insert(Nguoi n) {
        this.arrayListNguoi.add(n);
    }

    @Override
    public void update(int viTri, Nguoi n) {
        this.arrayListNguoi.set(viTri, n);
    }

    @Override
    public void delete(int viTri, Nguoi n) {
        this.arrayListNguoi.remove(viTri);
    }

    @Override
    public Nguoi get(int viTri) {
        return this.arrayListNguoi.get(viTri);
    }

    @Override
    public ArrayList<Nguoi> getList() {
        return this.arrayListNguoi;
    }
    
    @Override
    public void setList(ArrayList<Nguoi> list) {
       this.arrayListNguoi=list;
    }

    
    
    
}
