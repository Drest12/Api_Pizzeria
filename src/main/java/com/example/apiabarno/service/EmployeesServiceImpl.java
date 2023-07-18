package com.example.apiabarno.service;

import com.example.apiabarno.entity.Deductions;
import com.example.apiabarno.entity.Employees;
import com.example.apiabarno.repository.EmployeesRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceImpl implements EmployeesService{

    @Autowired
    private EmployeesRepository empRepository;

    @Override
    public List<Employees> findAll() {
        return empRepository.findAll();
    }

    @Override
    public List<Employees> findAllCustom() {
        return empRepository.findAllCustom();
    }

    @Override
    public Optional<Employees> findById(Integer id) {
        return empRepository.findById(id);
    }

    @Override
    public Employees add(Employees emp) {
        return empRepository.save(emp);
    }

    @Override
    public Employees update(Employees emp) {
        Employees objemployees = empRepository.getById(emp.getId());
        BeanUtils.copyProperties(emp, objemployees);
        return empRepository.save(objemployees);
    }

    @Override
    public void delete(Employees emp) {
        Employees objemployees = empRepository.getById(emp.getId());
        empRepository.delete(objemployees);
    }
}
