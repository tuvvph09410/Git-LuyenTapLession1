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
public interface QLDanhSachInterface {

    public void insert(Nguoi n);

    public void update(int viTri, Nguoi n);

    public void delete(int viTri);

    public Nguoi get(int viTri);

    public void setList(List<Nguoi> list);

    public List<Nguoi> getList();

}
