/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.recycling.recycling_project_faculty.dto;

import java.util.List;

/**
 *
 * @author HP
 */

public class LocationDto {
    private Long id;
    private Long postalCode;

    private Long state;
    
    private List<EmployeeDto> employees;

    public LocationDto() {
    }

    public LocationDto(Long id, Long postalCode, Long state, List<EmployeeDto> employees) {
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

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
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
