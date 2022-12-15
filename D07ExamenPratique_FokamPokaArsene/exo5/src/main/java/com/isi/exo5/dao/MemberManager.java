/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exo5.dao;

import com.isi.exo5.entity.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isi
 */
public class MemberManager {
      public static Member findOneById(int id) {
          Member output = null;
        String query = "SELECT * FROM membres WHERE membreId = ?;";
        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            if (result.next() == true) {
                String email = result.getString("email");
                String pwd = result.getString("pw");
                String name = result.getString("nom");
                output = new Member(id, name, email, pwd);
            }
            Manager.closeConnection(connection);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MemberManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

  

    public static Member findOneBy(String email, String pwd) {
        Member output = null;
        String query = "SELECT * FROM membres WHERE email = ? AND pw=?;";
        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ps.setString(1, email);
            ps.setString(2, pwd);
            ResultSet result = ps.executeQuery();
            if (result.next() == true) {
              
                int id = result.getInt("membreId");
                String name = result.getString("nom");
                output = new Member(id, name, email, pwd);
            }
            Manager.closeConnection(connection);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MemberManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }
    
       public static void main(String ...args){
       /* System.out.println(UserManager.findOneBy("ruben@gmail.com","passwordRuben"));
        User us = (UserManager.findOneBy("ruben@gmail.com","passwordRuben"));
        us.setEmail("user@gmail.com");
        int a = UserManager.update(us);
        System.out.print(a);*/
      
       System.out.print(MemberManager.findOneBy("b","c"));
}

}
