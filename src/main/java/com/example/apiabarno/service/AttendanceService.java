package com.example.apiabarno.service;

import com.example.apiabarno.entity.Attendance;

import java.util.List;
import java.util.Optional;

public interface AttendanceService {
    public List<Attendance> findAll();
    public List<Attendance> findAllCustom();
    public Optional<Attendance> findById(Integer id);
    public Attendance add(Attendance att);
    public Attendance update(Attendance att);
    public void delete(Attendance att);
}
