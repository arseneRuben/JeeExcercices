/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.afficheretudiant;

/**
 *
 * @author isi
 */
public class Etudiant {
    //attribut
	private String nom;
	private String prenom;
	private int age;
	
	//getteur setteur
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
        
        @Override
        public  String toString(){
            return this.nom + " " + this.prenom + " "+ this.age;
        }
}
