/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exosessionpanier;

import java.util.ArrayList;

/**
 *
 * @author isi
 */
public class ProductManager {

    public static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(0, "Bonbon", "format sachet de 12", 1000, 2.0));
        products.add(new Product(1, "Soda", "ack de 12", 100, 1.0));
        products.add(new Product(2, "Tomates", "20 g", 10, 4.0));
    }

    private Product findBy(int id) {
        return products.get(id);
    }

}
