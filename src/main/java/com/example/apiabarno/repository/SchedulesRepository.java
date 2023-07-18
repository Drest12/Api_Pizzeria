package com.example.apiabarno.repository;

import com.example.apiabarno.entity.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SchedulesRepository extends JpaRepository<Schedules, Integer> {
    @Query(value = "select sch from Schedules sch where sch.lastname = 1", nativeQuery = true)
    List<Schedules>findAllCustom();
}
