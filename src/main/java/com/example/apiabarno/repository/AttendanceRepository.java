package com.example.apiabarno.repository;

import com.example.apiabarno.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    @Query(value = "select att from Attendance att where att.lastname = 1", nativeQuery = true)
    List<Attendance>findAllCustom();
}
