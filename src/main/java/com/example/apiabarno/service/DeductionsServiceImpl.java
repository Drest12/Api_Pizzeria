package com.example.apiabarno.service;

import com.example.apiabarno.entity.Cashadvance;
import com.example.apiabarno.entity.Deductions;
import com.example.apiabarno.repository.DeductionsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeductionsServiceImpl implements DeductionsService{

    @Autowired
    private DeductionsRepository dedRepository;

    @Override
    public List<Deductions> findAll() {
        return dedRepository.findAll();
    }

    @Override
    public List<Deductions> findAllCustom() {
        return dedRepository.findAllCustom();
    }

    @Override
    public Optional<Deductions> findById(Integer id) {
        return dedRepository.findById(id);
    }

    @Override
    public Deductions add(Deductions ded) {
        return dedRepository.save(ded);
    }

    @Override
    public Deductions update(Deductions ded) {
        Deductions objdeductions = dedRepository.getById(ded.getId());
        BeanUtils.copyProperties(ded, objdeductions);
        return dedRepository.save(objdeductions);
    }

    @Override
    public void delete(Deductions ded) {
        Deductions objdeductions = dedRepository.getById(ded.getId());
        dedRepository.delete(objdeductions);
    }
}
