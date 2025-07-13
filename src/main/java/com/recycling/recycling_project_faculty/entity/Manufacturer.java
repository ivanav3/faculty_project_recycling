/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.recycling.recycling_project_faculty.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class Manufacturer {
    
    private Long id;
    private String name;
    private Date dateFounded;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "manufacturer")
    private List<Vehicle> vehicles;

    public Manufacturer() {
    }

    public Manufacturer(Long id, String name, Date dateFounded, List<Vehicle> vehicles) {
        this.id = id;
        this.name = name;
        this.dateFounded = dateFounded;
        this.vehicles = vehicles;
    }
 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(Date dateFounded) {
        this.dateFounded = dateFounded;
    }
    
    
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

   
    
}
