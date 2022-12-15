/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exosessiontodolist;

/**
 *
 * @author isi
 */
public class Item {
    private String name ;
    private int id;
    private boolean status;

    public Item(String name, int id, boolean status) {
        this.name = name;
        this.id = id;
        this.status = status;
    }

    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean statu) {
        this.status = statu;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
