package com.example.apiabarno.service;

import com.example.apiabarno.entity.Attendance;
import com.example.apiabarno.entity.Cashadvance;
import com.example.apiabarno.repository.CashadvanceRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CashadvanceServiceImpl implements CashadvanceService{

    @Autowired
    private CashadvanceRepository casRepository;

    @Override
    public List<Cashadvance> findAll() {
        return casRepository.findAll();
    }

    @Override
    public List<Cashadvance> findAllCustom() {
        return casRepository.findAllCustom();
    }

    @Override
    public Optional<Cashadvance> findById(Integer id) {
        return casRepository.findById(id);
    }

    @Override
    public Cashadvance add(Cashadvance cas) {
        return casRepository.save(cas);
    }

    @Override
    public Cashadvance update(Cashadvance cas) {
        Cashadvance objcashadvance = casRepository.getById(cas.getId());
        BeanUtils.copyProperties(cas, objcashadvance);
        return casRepository.save(objcashadvance);
    }

    @Override
    public void delete(Cashadvance cas) {
        Cashadvance objcashadvance = casRepository.getById(cas.getId());
        casRepository.delete(objcashadvance);
    }
}
