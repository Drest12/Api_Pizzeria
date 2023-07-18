package com.example.apiabarno.repository;

import com.example.apiabarno.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
    @Query(value = "select emp from Employees emp where emp.lastname = 1", nativeQuery = true)
    List<Employees>findAllCustom();
}
