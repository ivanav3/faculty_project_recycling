/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.mapper.impl;

import com.project.faculty_project_recycling.dto.StateDto;
import com.project.faculty_project_recycling.entity.State;
import com.project.faculty_project_recycling.mapper.Mapper;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
public class StateMapper implements Mapper<StateDto, State>{
    private LocationMapper locationMapper;
    
    public StateMapper(LocationMapper locationMapper){
        this.locationMapper=locationMapper;
    }

    @Override
    public State toEntity(StateDto dto) {
       return new State(dto.getId(),dto.getName(),dto.getLocations().stream().map(locationDto->locationMapper.toEntity(locationDto)).collect(Collectors.toList()));
    }

    @Override
    public StateDto toDto(State entity) {
    return new StateDto(entity.getId(),entity.getName(),entity.getLocations().stream().map(location->locationMapper.toDto(location)).collect(Collectors.toList()));}
    
    
}
