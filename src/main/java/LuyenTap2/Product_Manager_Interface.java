/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap2;

import java.util.List;

/**
 *
 * @author vuvantu
 */
public interface Product_Manager_Interface {

    public void add(Product p);

    public void update(int position, Product p);

    public void delete(int position);

    public void setList(List<Product> list);

    public Product get(int position);

    public List<Product> getList();
}
