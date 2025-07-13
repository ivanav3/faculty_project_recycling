/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class ManufacturerDto implements Serializable {

    private Long id;
    private String name;
    private Date dateFounded;

    private List<VehicleDto> vehicles;

    public ManufacturerDto() {
    }

    public ManufacturerDto(Long id, String name, Date dateFounded) {
        this.id = id;
        this.name = name;
        this.dateFounded = dateFounded;
        vehicles = new ArrayList<>();

    }

    public ManufacturerDto(Long id, String name, Date dateFounded, List<VehicleDto> vehicles) {
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

    public List<VehicleDto> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehicleDto> vehicles) {
        this.vehicles = vehicles;
    }

}
