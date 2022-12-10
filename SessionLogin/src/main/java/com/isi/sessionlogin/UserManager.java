/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.sessionlogin;

/**
 *
 * @author isi
 */
public class UserManager {

    public static User test() {
        User test = new User();
        test.setPassword("isi");
        test.setUsername("etudiant");
        return test;
    }

    public static User findBy(String username, String password) {
        User output = null;
        if (test().getPassword().equalsIgnoreCase(password) && test().getUsername().equalsIgnoreCase(username)) {
            output = test();
        }
        return output;
    }
}
