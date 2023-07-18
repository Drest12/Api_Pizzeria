package com.example.apiabarno.repository;

import com.example.apiabarno.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position, Integer> {
    @Query(value = "select pos from Position pos where pos.lastname = 1", nativeQuery = true)
    List<Position>findAllCustom();
}
