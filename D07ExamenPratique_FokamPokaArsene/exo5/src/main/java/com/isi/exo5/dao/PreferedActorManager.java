/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exo5.dao;

import com.isi.exo5.entity.Actor;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isi
 */
public class PreferedActorManager extends Manager{
    public static int insert(int user_id, int actor_id) {
        int result = -1;
        String query = "INSERT  INTO  listeactorpref(idMembre, idActor)  VALUES(?,?) ;";
        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ps.setInt(1, user_id);
            ps.setInt(1, actor_id);
           
            result = ps.executeUpdate();
            if (connexion != null) {
                connexion.close();
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PreferedActorManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
