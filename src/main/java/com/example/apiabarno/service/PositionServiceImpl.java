package com.example.apiabarno.service;

import com.example.apiabarno.entity.Overtime;
import com.example.apiabarno.entity.Position;
import com.example.apiabarno.repository.PositionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
    private PositionRepository posRepository;

    @Override
    public List<Position> findAll() {
        return posRepository.findAll();
    }

    @Override
    public List<Position> findAllCustom() {
        return posRepository.findAllCustom();
    }

    @Override
    public Optional<Position> findById(Integer id) {
        return posRepository.findById(id);
    }

    @Override
    public Position add(Position pos) {
        return posRepository.save(pos);
    }

    @Override
    public Position update(Position pos) {
        Position objposition = posRepository.getById(pos.getId());
        BeanUtils.copyProperties(pos, objposition);
        return posRepository.save(objposition);
    }

    @Override
    public void delete(Position pos) {
        Position objposition = posRepository.getById(pos.getId());
        posRepository.delete(objposition);
    }
}
