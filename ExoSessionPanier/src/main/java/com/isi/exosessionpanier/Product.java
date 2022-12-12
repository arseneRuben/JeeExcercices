/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exosessionpanier;

/**
 *
 * @author isi
 */
public class Product {

    private int id;
    private String designation;
    private String description;
    private int stock;
    private double price;

    public Product(int id, String designation, String description, int stock, double price) {
        this.id = id;
        this.designation = designation;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(String designation, String description, int stock, double price) {
        this.designation = designation;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
