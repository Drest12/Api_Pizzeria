package com.example.apiabarno.service;

import com.example.apiabarno.entity.Admin;

import java.util.List;
import java.util.Optional;

public interface AdminService {
     public List<Admin> findAll();
     public List<Admin> findAllCustom();
     public Optional<Admin> findById(int id);
     public Admin add(Admin adm);
     public Admin update(Admin adm);
     public void delete(int adm);
}
