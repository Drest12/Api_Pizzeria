package com.example.apiabarno.service;

import com.example.apiabarno.entity.Overtime;
import com.example.apiabarno.entity.Position;

import java.util.List;
import java.util.Optional;

public interface PositionService {
    public List<Position> findAll();
    public List<Position> findAllCustom();
    public Optional<Position> findById(Integer id);
    public Position add(Position pos);
    public Position update(Position pos);
    public void delete(Position pos);
}
