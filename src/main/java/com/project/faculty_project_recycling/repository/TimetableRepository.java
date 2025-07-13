/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.faculty_project_recycling.repository;

import com.project.faculty_project_recycling.entity.Timetable;
import com.project.faculty_project_recycling.entity.TimetableId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface TimetableRepository extends JpaRepository<Timetable,TimetableId>{
    
}

