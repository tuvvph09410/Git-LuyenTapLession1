/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vuvantu
 */
public class QuanLySach implements QuanLySach_Interface {

    private List<Sach> listSach;

    public QuanLySach(List<Sach> listSach) {
        this.listSach = listSach;
    }

    public QuanLySach() {
        this.listSach = new ArrayList<>();
    }

    @Override
    public void add(Sach s) {
        this.listSach.add(s);
    }

    @Override
    public void update(int position, Sach s) {
        this.listSach.set(position, s);
    }

    @Override
    public void delete(int position) {
        this.listSach.remove(position);
    }

    @Override
    public void setList(List<Sach> listSach) {
        this.listSach = listSach;
    }

    @Override
    public Sach get(int position) {
        return this.listSach.get(position);
    }

    @Override
    public List<Sach> getList() {
        return this.listSach;
    }

}
