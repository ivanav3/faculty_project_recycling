/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author HP
 */
@Embeddable
public class TimetableId implements Serializable {
    
    private Date id;
    private Long employeeId;
    private Long vehicleId;
    
    public TimetableId() {
    }
    
    public TimetableId(Date id, Long employeeId, Long vehicleId) {
        this.id = id;
        this.employeeId = employeeId;
        this.vehicleId = vehicleId;
    }
    
    public Date getId() {
        return id;
    }
    
    public void setId(Date id) {
        this.id = id;
    }
    
    public Long getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    
    public Long getVehicleId() {
        return vehicleId;
    }
    
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    @Override
    public int hashCode() {
       return Objects.hash(id, employeeId, vehicleId);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimetableId t = (TimetableId) obj;
        return employeeId.equals(t.employeeId) && vehicleId.equals(t.vehicleId)
                && id.equals(t.id);
        
    }   
    
    
}
