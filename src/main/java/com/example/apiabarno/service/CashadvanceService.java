package com.example.apiabarno.service;

import com.example.apiabarno.entity.Attendance;
import com.example.apiabarno.entity.Cashadvance;

import java.util.List;
import java.util.Optional;

public interface CashadvanceService {
    public List<Cashadvance> findAll();
    public List<Cashadvance> findAllCustom();
    public Optional<Cashadvance> findById(Integer id);
    public Cashadvance add(Cashadvance cas);
    public Cashadvance update(Cashadvance cas);
    public void delete(Cashadvance cas);
}
