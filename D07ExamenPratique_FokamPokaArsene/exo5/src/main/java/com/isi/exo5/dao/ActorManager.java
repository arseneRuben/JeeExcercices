/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exo5.dao;

import com.isi.exo5.entity.Actor;
import com.isi.exo5.entity.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isi
 */
public class ActorManager extends Manager {
    public static ArrayList<Actor> findByFilm(int movieId) {
        ArrayList<Actor> actors = new ArrayList<>();
        String query = "SELECT DISTINCT * FROM  actor "
                + "INNER JOIN casting ON actorid = id"
                + " WHERE movieid=?;";
        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ps.setInt(1, movieId);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                Actor act = new Actor(id, name);
                actors.add(act);
            }
            Manager.closeConnection(connection);          
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return actors;
    }
    
     public static ArrayList<Actor> findByUser(int userId) {
        ArrayList<Actor> actors = new ArrayList<>();
        String query = "SELECT DISTINCT * FROM  actor "
                + "INNER JOIN listeactorpref ON id = idActor"
                + " WHERE idMembre=?;";
        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ps.setInt(1, userId);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                Actor act = new Actor(id, name);
                actors.add(act);
            }
            Manager.closeConnection(connection);          
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return actors;
    }
}
