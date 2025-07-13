/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long capacity;
    private Long weight;

    private Long manufacturer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//            mappedBy = "vehicle")
    private List<Timetable> timetables;

    public Vehicle() {
    }

    public Vehicle(Long id, Long capacity, Long weight, Long manufacturer) {
        this.id = id;
        this.capacity = capacity;
        this.weight = weight;
        this.manufacturer = manufacturer;
        timetables=new ArrayList<>();
    }
    
    

    public Vehicle(Long id, Long capacity, Long weight, Long manufacturer, List<Timetable> timetables) {
        this.id = id;
        this.capacity = capacity;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.timetables = timetables;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public Long getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Long manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Timetable> getTimetables() {
        return timetables;
    }

    public void setTimetables(List<Timetable> timetables) {
        this.timetables = timetables;
    }

}
