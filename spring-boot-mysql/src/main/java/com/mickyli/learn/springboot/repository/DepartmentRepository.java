package com.mickyli.learn.springboot.repository;

import com.mickyli.learn.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
}
