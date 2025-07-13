/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

/**
 *
 * @author HP
 */
@Entity
public class Timetable {
    
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private Date id;
//    
//    @Id
//    private Long employee;
//    @Id
//    private Long vehicle;
    
    @EmbeddedId
    private TimetableId timetableId;
    
    private Boolean recycling;

    public Timetable() {
        
    }

    public Timetable(TimetableId timetableId, Boolean recycling) {
        this.timetableId = timetableId;
        this.recycling = recycling;
    }

    public TimetableId getTimetableId() {
        return timetableId;
    }

    public void setTimetableId(TimetableId timetableId) {
        this.timetableId = timetableId;
    }

    public Boolean getRecycling() {
        return recycling;
    }

    public void setRecycling(Boolean recycling) {
        this.recycling = recycling;
    }

    
    
    
    
}
