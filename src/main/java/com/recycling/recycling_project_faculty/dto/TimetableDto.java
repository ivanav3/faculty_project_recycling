/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.recycling.recycling_project_faculty.dto;

import java.util.Date;

/**
 *
 * @author HP
 */
public class TimetableDto {
    
    private Date id;
    
    private Long employee;
    private Long vehicle;
    
    private Boolean recycling;

    public TimetableDto() {
    }

    public TimetableDto(Date id, Long employee, Long vehicle, Boolean recycling) {
        this.id = id;
        this.employee = employee;
        this.vehicle = vehicle;
        this.recycling = recycling;
    }

    public Date getId() {
        return id;
    }

    public void setId(Date id) {
        this.id = id;
    }

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }

    public Long getVehicle() {
        return vehicle;
    }

    public void setVehicle(Long vehicle) {
        this.vehicle = vehicle;
    }

    public Boolean getRecycling() {
        return recycling;
    }

    public void setRecycling(Boolean recycling) {
        this.recycling = recycling;
    }
    
    
    
    
}
