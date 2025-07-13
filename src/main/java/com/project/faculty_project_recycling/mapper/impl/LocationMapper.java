/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.mapper.impl;

import com.project.faculty_project_recycling.dto.LocationDto;
import com.project.faculty_project_recycling.entity.Location;
import com.project.faculty_project_recycling.mapper.Mapper;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
public class LocationMapper implements Mapper<LocationDto, Location>{
    private EmployeeMapper employeeMapper;

    public LocationMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }
    
    
    
    @Override
    public Location toEntity(LocationDto dto) {
        return new Location(dto.getId(),dto.getPostalCode(),dto.getState(),
                                     dto.getEmployees().stream().map(employeeDto->employeeMapper.toEntity(employeeDto)).collect(Collectors.toList()));

    }
    

    @Override
    public LocationDto toDto(Location entity) {
       return new LocationDto(entity.getId(),entity.getPostalCode(),entity.getState(),
                                     entity.getEmployees().stream().map(employee->employeeMapper.toDto(employee)).collect(Collectors.toList()));
 }
    
}
