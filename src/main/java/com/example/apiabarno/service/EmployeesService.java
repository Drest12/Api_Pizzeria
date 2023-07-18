package com.example.apiabarno.service;

import com.example.apiabarno.entity.Deductions;
import com.example.apiabarno.entity.Employees;

import java.util.List;
import java.util.Optional;

public interface EmployeesService {
    public List<Employees> findAll();
    public List<Employees> findAllCustom();
    public Optional<Employees> findById(Integer id);
    public Employees add(Employees emp);
    public Employees update(Employees emp);
    public void delete(Employees emp);
}
