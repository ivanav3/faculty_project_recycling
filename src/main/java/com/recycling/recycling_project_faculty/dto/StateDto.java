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
public class StateDto {
    
    private Long id;
    private String name;
    
    private List<LocationDto> locations;

    public StateDto() {
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
