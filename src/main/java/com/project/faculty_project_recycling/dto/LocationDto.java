/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */

public class LocationDto  implements Serializable{
    private Long id;
    private String postalCode;

    private Long state;
    
    private List<EmployeeDto> employees;

    public LocationDto() {
    }

    public LocationDto(Long id, String postalCode, Long state) {
        this.id = id;
        this.postalCode = postalCode;
        this.state = state;
        employees=new ArrayList<>();
    }

    public LocationDto(Long id, String postalCode, Long state, List<EmployeeDto> employees) {
        this.id = id;
        this.postalCode = postalCode;
        this.state = state;
        this.employees = employees;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }
    
    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }

   

}
