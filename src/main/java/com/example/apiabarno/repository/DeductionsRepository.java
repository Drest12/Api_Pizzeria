package com.example.apiabarno.repository;

import com.example.apiabarno.entity.Deductions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeductionsRepository extends JpaRepository<Deductions, Integer> {
    @Query(value = "select ded from Deductions ded where ded.lastname = 1", nativeQuery = true)
    List<Deductions>findAllCustom();
}
