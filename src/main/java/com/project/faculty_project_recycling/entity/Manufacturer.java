/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
@Entity
public class Manufacturer {
    
    @Id
    private Long id;
    private String name;
    private Date dateFounded;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "manufacturer")
    private List<Vehicle> vehicles;

    public Manufacturer() {
    }

    public Manufacturer(Long id, String name, Date dateFounded) {
        this.id = id;
        this.name = name;
        this.dateFounded = dateFounded;
        vehicles=new ArrayList<>();
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
