/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vuvantu
 */
public class Manager_Product implements Product_Manager_Interface {

    private List<Product> listProduct;

    public Manager_Product(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public Manager_Product() {
        this.listProduct = new ArrayList<>();
    }

    @Override
    public void add(Product p) {
        this.listProduct.add(p);
    }

    @Override
    public void update(int position, Product p) {
        this.listProduct.set(position, p);
    }

    @Override
    public void delete(int position) {
        this.listProduct.remove(position);
    }

    @Override
    public void setList(List<Product> list) {
        this.listProduct = list;
    }

    @Override
    public Product get(int position) {
        return this.listProduct.get(position);
    }

    @Override
    public List<Product> getList() {
        return this.listProduct;
    }

}
