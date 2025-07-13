/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.mapper.impl;

import com.project.faculty_project_recycling.dto.EmployeeDto;
import com.project.faculty_project_recycling.entity.Employee;
import com.project.faculty_project_recycling.mapper.Mapper;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
public class EmployeeMapper implements Mapper<EmployeeDto, Employee>{
    private TimetableMapper timetableMapper;

    public EmployeeMapper(TimetableMapper timetableMapper) {
        this.timetableMapper = timetableMapper;
    }
    
    

    @Override
    public Employee toEntity(EmployeeDto dto) {
        return new Employee(dto.getId(),dto.getFirstName(),dto.getLastName(),dto.getLocation(),
       
                dto.getTimetables().stream().map(timetableDto->timetableMapper.toEntity(timetableDto)).collect(Collectors.toList()));
    }

    @Override
    public EmployeeDto toDto(Employee entity) {
      return new EmployeeDto(entity.getId(),entity.getFirstName(),entity.getLastName(),entity.getLocation(),
       
                entity.getTimetables().stream().map(timetable->timetableMapper.toDto(timetable)).collect(Collectors.toList()));
    
    }
    
}
