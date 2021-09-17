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
public interface QLDanhSachInterface {

    public void insert(Nguoi n);

    public void update(int viTri, Nguoi n);

    public void delete(int viTri, Nguoi n);

    public Nguoi get(int viTri);

    public ArrayList<Nguoi> getList();

    public void setList(ArrayList<Nguoi> list);

}
