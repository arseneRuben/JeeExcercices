/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.cookiespreferences;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;

/**
 *
 * @author isi
 */
public class CookyManager {
    public static Cookie getCookie(HttpServletRequest request , String key){
        Cookie[] cookies = request.getCookies();
        Cookie searched = null;
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(key)){
                   searched = cookie;
                }
            }
        }
        return searched;
    }
}
