/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author vuvantu
 */
public class QLDanhSach implements QLDanhSachInterface {

    private List<Nguoi> arrayListNguoi;

    public QLDanhSach() {
        this.arrayListNguoi = new ArrayList<>();
    }

    public QLDanhSach(List<Nguoi> arrayListNguoi) {
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
    public void delete(int viTri) {
        this.arrayListNguoi.remove(viTri);
    }

    @Override
    public Nguoi get(int viTri) {
        return this.arrayListNguoi.get(viTri);
    }

    @Override
    public List<Nguoi> getList() {
        return this.arrayListNguoi;
    }

    @Override
    public void setList(List<Nguoi> list) {
        this.arrayListNguoi = list;
    }

}
