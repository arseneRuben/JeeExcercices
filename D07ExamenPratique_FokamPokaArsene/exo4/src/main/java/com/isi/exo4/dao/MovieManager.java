/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.exo4.dao;

import com.isi.exo4.entity.Movie;
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
public class MovieManager extends Manager {

    public static ArrayList<Movie> findAll() {
        ArrayList<Movie> activities = new ArrayList<>();
        String query = "SELECT * FROM  movie;";

        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                float yr = result.getFloat("yr");
                float score = result.getFloat("score");
                int votes = result.getInt("votes");
                int director = result.getInt("director");
                Movie act = new Movie(id, title, yr, score, votes, director);
                activities.add(act);

            }
            Manager.closeConnection(connection);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return activities;
    }

    public static ArrayList<Movie> findByYear(String year) {
        ArrayList<Movie> activities = new ArrayList<>();
        String query = "SELECT DISTINCT * FROM  movie WHERE yr=?;";

        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ps.setString(1, year);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                float yr = result.getFloat("yr");
                float score = result.getFloat("score");
                int votes = result.getInt("votes");
                int director = result.getInt("director");
                Movie act = new Movie(id, title, yr, score, votes, director);
                activities.add(act);

            }
            Manager.closeConnection(connection);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return activities;
    }

    public static ArrayList<String> findAllYears() {
        ArrayList<String> years = new ArrayList<>();
        String query = "SELECT DISTINCT yr FROM  movie;";
        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String yr = result.getString("yr");
                years.add(yr);
            }
            Manager.closeConnection(connection);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return years;

    }

    public static Movie findById(int id) {
        Movie movie = null;
        String query = "SELECT DISTINCT * FROM  movie WHERE id=?;";
        try {
            Connection connection = Manager.getConnection();
            PreparedStatement ps = Manager.getPreparedStatement(connection, query);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String title = result.getString("title");
                float yr = result.getFloat("yr");
                float score = result.getFloat("score");
                int votes = result.getInt("votes");
                int director = result.getInt("director");
                movie = new Movie(id, title, yr, score, votes, director);
            }
            Manager.closeConnection(connection);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return movie;
    }

}
