package com.example.apiabarno.service;

import com.example.apiabarno.entity.Attendance;
import com.example.apiabarno.repository.AttendanceRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceServiceImpl implements AttendanceService{

    @Autowired
    private AttendanceRepository attRepository;

    @Override
    public List<Attendance> findAll() {
        return attRepository.findAll();
    }

    @Override
    public List<Attendance> findAllCustom() {
        return attRepository.findAllCustom();
    }

    @Override
    public Optional<Attendance> findById(Integer id) {
        return attRepository.findById(id);
    }

    @Override
    public Attendance add(Attendance att) {
        return attRepository.save(att);
    }

    @Override
    public Attendance update(Attendance att) {
        Attendance objattendance = attRepository.getById(att.getId());
        BeanUtils.copyProperties(att, objattendance);
        return attRepository.save(objattendance);
    }

    @Override
    public void delete(Attendance att) {
        Attendance objattendance = attRepository.getById(att.getId());
        attRepository.delete(objattendance);
    }
}
