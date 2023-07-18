package com.example.apiabarno.repository;

import com.example.apiabarno.entity.Overtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OvertimeRepository extends JpaRepository<Overtime, Integer>{
    @Query(value = "select ove from Overtime ove where ove.lastname = 1", nativeQuery = true)
    List<Overtime>findAllCustom();
}
