/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.mapper.impl;

import com.project.faculty_project_recycling.dto.TimetableDto;
import com.project.faculty_project_recycling.entity.Timetable;
import com.project.faculty_project_recycling.entity.TimetableId;
import com.project.faculty_project_recycling.mapper.Mapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component

public class TimetableMapper implements Mapper<TimetableDto, Timetable>{

    @Override
    public Timetable toEntity(TimetableDto dto) {
        return new Timetable(new TimetableId(dto.getId(),dto.getEmployee(),dto.getVehicle()),dto.getRecycling());
    }

    @Override
    public TimetableDto toDto(Timetable entity) {
        return new TimetableDto(entity.getTimetableId().getId(),entity.getTimetableId().getEmployeeId(),
        entity.getTimetableId().getVehicleId(),entity.getRecycling());
    }
    
}
