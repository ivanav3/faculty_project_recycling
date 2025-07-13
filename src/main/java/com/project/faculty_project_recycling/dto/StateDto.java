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
public class StateDto  implements Serializable{
    
    private Long id;
    private String name;
    
    private List<LocationDto> locations;

    public StateDto() {
    }

    public StateDto(Long id, String name) {
        this.id = id;
        this.name = name;
        locations=new ArrayList<>();
    }

    
    
    public StateDto(Long id, String name, List<LocationDto> locations) {
        this.id = id;
        this.name = name;
        this.locations = locations;
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

    public List<LocationDto> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationDto> locations) {
        this.locations = locations;
    }
    
    
    
}
