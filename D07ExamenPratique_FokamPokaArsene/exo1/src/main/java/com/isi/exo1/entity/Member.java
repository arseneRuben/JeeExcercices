/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exo1.entity;

/**
 *
 * @author isi
 */
public class Member extends Entity{
   
    private String nom;
    private String email;
    private String pw;

    
    
    public Member(int memberId, String nom, String email, String pw) {
        super(memberId);
        this.nom = nom;
        this.email = email;
        this.pw = pw;
    }
    
    
    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
