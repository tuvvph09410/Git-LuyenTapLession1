/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap3;

import java.util.List;

/**
 *
 * @author vuvantu
 */
public interface QuanLySach_Interface {
    public void add(Sach s);
    public void update(int position,Sach s);
    public void delete(int position);
    public void setList(List<Sach> listSach);
    public Sach get(int position);
    public List<Sach> getList();
}
