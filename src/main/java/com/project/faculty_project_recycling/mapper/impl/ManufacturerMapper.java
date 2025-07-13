/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.mapper.impl;

import com.project.faculty_project_recycling.dto.ManufacturerDto;
import com.project.faculty_project_recycling.entity.Manufacturer;
import com.project.faculty_project_recycling.mapper.Mapper;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
public class ManufacturerMapper implements Mapper<ManufacturerDto,Manufacturer>{
    private VehicleMapper vehicleMapper;

    public ManufacturerMapper(VehicleMapper vehicleMapper) {
        this.vehicleMapper = vehicleMapper;
    }
    

    @Override
    public Manufacturer toEntity(ManufacturerDto dto) {
        return new Manufacturer(dto.getId(),dto.getName(),dto.getDateFounded(),
                             dto.getVehicles().stream().map(vehicleDto->vehicleMapper.toEntity(vehicleDto)).collect(Collectors.toList()));

    }

    @Override
    public ManufacturerDto toDto(Manufacturer entity) {
        return new ManufacturerDto(entity.getId(),entity.getName(),entity.getDateFounded()
        ,                        entity.getVehicles().stream().map(vehicle->vehicleMapper.toDto(vehicle)).collect(Collectors.toList()));

    }
    
}
