package com.example.apiabarno.service;

import com.example.apiabarno.entity.Employees;
import com.example.apiabarno.entity.Overtime;
import com.example.apiabarno.repository.OvertimeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OvertimeServiceImpl implements OvertimeService{

    @Autowired
    private OvertimeRepository oveRepository;

    @Override
    public List<Overtime> findAll() {
        return oveRepository.findAll();
    }

    @Override
    public List<Overtime> findAllCustom() {
        return oveRepository.findAllCustom();
    }

    @Override
    public Optional<Overtime> findById(Integer id) {
        return oveRepository.findById(id);
    }

    @Override
    public Overtime add(Overtime ove) {
        return oveRepository.save(ove);
    }

    @Override
    public Overtime update(Overtime ove) {
        Overtime objovertime = oveRepository.getById(ove.getId());
        BeanUtils.copyProperties(ove, objovertime);
        return oveRepository.save(objovertime);
    }

    @Override
    public void delete(Overtime ove) {
        Overtime objovertime = oveRepository.getById(ove.getId());
        oveRepository.delete(objovertime);
    }
}
