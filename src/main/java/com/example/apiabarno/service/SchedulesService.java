package com.example.apiabarno.service;

import com.example.apiabarno.entity.Position;
import com.example.apiabarno.entity.Schedules;

import java.util.List;
import java.util.Optional;

public interface SchedulesService {
    public List<Schedules> findAll();
    public List<Schedules> findAllCustom();
    public Optional<Schedules> findById(Integer id);
    public Schedules add(Schedules sch);
    public Schedules update(Schedules sch);
    public void delete(Schedules sch);
}
