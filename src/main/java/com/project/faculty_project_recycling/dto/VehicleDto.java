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
public class VehicleDto implements Serializable {

    private Long id;
    private Long capacity;
    private Long weight;

    private Long manufacturer;

    private List<TimetableDto> timetables;

    public VehicleDto() {
    }

    public VehicleDto(Long id, Long capacity, Long weight, Long manufacturer) {
        this.id = id;
        this.capacity = capacity;
        this.weight = weight;
        this.manufacturer = manufacturer;
        timetables = new ArrayList<>();

    }

    public VehicleDto(Long id, Long capacity, Long weight, Long manufacturer, List<TimetableDto> timetables) {
        this.id = id;
        this.capacity = capacity;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.timetables = timetables;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public Long getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Long manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<TimetableDto> getTimetables() {
        return timetables;
    }

    public void setTimetables(List<TimetableDto> timetables) {
        this.timetables = timetables;
    }

}
