package com.example.apiabarno.service;

import com.example.apiabarno.entity.Admin;
import com.example.apiabarno.repository.AdminRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepository admRepository;

    @Override
    public List<Admin> findAll() {
        return admRepository.findAll();
    }

    @Override
    public List<Admin> findAllCustom() {
        return admRepository.findAllCustom();
    }

    @Override
    public Optional<Admin> findById(int id) {
        return admRepository.findById(id);
    }

    @Override
    public Admin add(Admin adm) {
        return admRepository.save(adm);
    }

    @Override
    public Admin update(Admin adm) {
        Admin objadmin = admRepository.findById(adm.getId()).orElse(null);
        if (objadmin == null) return null;
        BeanUtils.copyProperties(adm, objadmin);
        return admRepository.save(objadmin);
    }

    @Override
    public void delete(int id) {
        //Admin objadmin = admRepository.getById(adm.getId());
        if (!admRepository.existsById(id)) return;
        admRepository.deleteById(id);
    }
}
