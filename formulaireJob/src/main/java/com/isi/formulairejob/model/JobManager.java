/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.formulairejob.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author isi
 */
public class JobManager {

    public static ArrayList<Job> jobs = new ArrayList<Job>();

    public static void fullFillJobs() {
        jobs.add(new Job("java devellopper", "plein"));
        jobs.add(new Job("devellopper c#", "partiel"));
        jobs.add(new Job("integrateur web", "partiel"));
        jobs.add(new Job("Asp MVC 6 Dev", "plein"));
        jobs.add(new Job("React JS node microservice", "plein"));
        jobs.add(new Job("dessinateur", "partiel"));
    }

    static {
        fullFillJobs();
    }

    public static ArrayList<Job> findAll() {
        return jobs;
    }

    public static ArrayList<Job> findBy(String type ) {
      
        if (type == null) {
            return findAll();
        } else {
             
            ArrayList<Job> result = new ArrayList<>();
             
            for (Job job : jobs) {
               
                if (type.equals(job.getType())) {
                    result.add(job);
                }
            }

            return result;
        }

    }
}
