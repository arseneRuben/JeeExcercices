/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.afficheretudiant;

import java.util.ArrayList;

/**
 *
 * @author isi
 */
public class RemplirEtudiant {
    public static ArrayList<Etudiant> index(){
        ArrayList<Etudiant>  list = new ArrayList<Etudiant>();
        Etudiant etd = new Etudiant();
        etd.setAge(20);
        etd.setNom("Yao");
        etd.setPrenom("Alfred");
        list.add(etd);
        etd = new Etudiant();
        etd.setAge(22);
        etd.setNom("Wanmegni");
        etd.setPrenom("Franklin");
        list.add(etd);
        etd = new Etudiant();
        etd.setAge(24);
        etd.setNom("Traore");
        etd.setPrenom("Aminata");
        list.add(etd);
        System.out.println(list);
        return list;
    }
    public static void main(String[] args){
        System.out.print(RemplirEtudiant.index());
    }
}
