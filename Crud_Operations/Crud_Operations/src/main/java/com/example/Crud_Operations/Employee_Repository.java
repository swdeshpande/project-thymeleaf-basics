package com.example.Crud_Operations;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee_Repository extends JpaRepository<Employee, Long> {
    
    List<Employee> findByName(String name);
    
}