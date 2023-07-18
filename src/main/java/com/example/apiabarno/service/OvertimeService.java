package com.example.apiabarno.service;

import com.example.apiabarno.entity.Employees;
import com.example.apiabarno.entity.Overtime;

import java.util.List;
import java.util.Optional;

public interface OvertimeService {
    public List<Overtime> findAll();
    public List<Overtime> findAllCustom();
    public Optional<Overtime> findById(Integer id);
    public Overtime add(Overtime ove);
    public Overtime update(Overtime ove);
    public void delete(Overtime ove);
}
