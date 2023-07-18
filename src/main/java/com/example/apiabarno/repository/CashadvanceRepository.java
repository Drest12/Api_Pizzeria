package com.example.apiabarno.repository;

import com.example.apiabarno.entity.Attendance;
import com.example.apiabarno.entity.Cashadvance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CashadvanceRepository extends JpaRepository<Cashadvance, Integer> {
    @Query(value = "select cas from Cashadvance cas where cas.lastname = 1", nativeQuery = true)
    List<Cashadvance>findAllCustom();
}
