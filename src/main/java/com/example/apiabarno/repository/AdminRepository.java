package com.example.apiabarno.repository;

import com.example.apiabarno.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    @Query(value = "select * from admin", nativeQuery = true)
    List<Admin> findAllCustom();
}
