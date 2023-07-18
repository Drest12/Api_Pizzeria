package com.example.apiabarno.service;

import com.example.apiabarno.entity.Position;
import com.example.apiabarno.entity.Schedules;
import com.example.apiabarno.repository.SchedulesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchedulesServiceImpl implements SchedulesService{

    @Autowired
    private SchedulesRepository schRepository;

    @Override
    public List<Schedules> findAll() {
        return schRepository.findAll();
    }

    @Override
    public List<Schedules> findAllCustom() {
        return schRepository.findAllCustom();
    }

    @Override
    public Optional<Schedules> findById(Integer id) {
        return schRepository.findById(id);
    }

    @Override
    public Schedules add(Schedules sch) {
        return schRepository.save(sch);
    }

    @Override
    public Schedules update(Schedules sch) {
        Schedules objschedules = schRepository.getById(sch.getId());
        BeanUtils.copyProperties(sch, objschedules);
        return schRepository.save(objschedules);
    }

    @Override
    public void delete(Schedules sch) {
        Schedules objschedules = schRepository.getById(sch.getId());
        schRepository.delete(objschedules);
    }
}
