/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.mapper.impl;

import com.project.faculty_project_recycling.dto.VehicleDto;
import com.project.faculty_project_recycling.entity.Vehicle;
import com.project.faculty_project_recycling.mapper.Mapper;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
public class VehicleMapper implements Mapper<VehicleDto, Vehicle> {

    private TimetableMapper timetableMapper;

    public VehicleMapper(TimetableMapper timetableMapper) {
        this.timetableMapper = timetableMapper;
    }

    @Override
    public Vehicle toEntity(VehicleDto dto) {
        return new Vehicle(dto.getId(), dto.getCapacity(), dto.getWeight(), dto.getManufacturer(),
                     dto.getTimetables().stream().map(timetableDto->timetableMapper.toEntity(timetableDto)).collect(Collectors.toList()));
        
    }

    @Override
    public VehicleDto toDto(Vehicle entity) {
        return new VehicleDto(entity.getId(), entity.getCapacity(), entity.getWeight(), entity.getManufacturer(),
                        entity.getTimetables().stream().map(timetable->timetableMapper.toDto(timetable)).collect(Collectors.toList()));
    }

}
