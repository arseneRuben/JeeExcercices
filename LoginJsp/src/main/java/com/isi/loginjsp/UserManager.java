/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.loginjsp;

/**
 *
 * @author isi
 */
public class UserManager {
    public static boolean checkUser(User usr){
      return usr.getLogin().equals("etudiant") && usr.getPassword().equals("abc123...");
    }
}
