package com.example.apiabarno.controller;

import com.example.apiabarno.entity.Admin;
import com.example.apiabarno.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService admService;

    @GetMapping
    public List<Admin> findAll(){
        return admService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Admin> findById(@PathVariable int id){
        return null;
    }

    @PostMapping
    public Admin add(@RequestBody Admin adm){
        return admService.add(adm);
    }

    @PostMapping("/{id}")
    public Admin update(@PathVariable Integer id, @RequestBody Admin adm){
        adm.setId(id);
        return admService.update(adm);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        admService.delete(id);
    }
}
