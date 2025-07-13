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
public class EmployeeDto {
    
    private Long id;
    private String firstName;
    private String lastName;
    private Long location;
    
    private List<TimetableDto> timetables;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String firstName, String lastName, Long location, List<TimetableDto> timetables) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.timetables = timetables;
    }

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public List<TimetableDto> getTimetables() {
        return timetables;
    }

    public void setTimetables(List<TimetableDto> timetables) {
        this.timetables = timetables;
    }
    
    
    
    
}
