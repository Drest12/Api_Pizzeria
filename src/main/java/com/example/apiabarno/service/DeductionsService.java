package com.example.apiabarno.service;

import com.example.apiabarno.entity.Cashadvance;
import com.example.apiabarno.entity.Deductions;

import java.util.List;
import java.util.Optional;

public interface DeductionsService {
    public List<Deductions> findAll();
    public List<Deductions> findAllCustom();
    public Optional<Deductions> findById(Integer id);
    public Deductions add(Deductions ded);
    public Deductions update(Deductions ded);
    public void delete(Deductions ded);
}
