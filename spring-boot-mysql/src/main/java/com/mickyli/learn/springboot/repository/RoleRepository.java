package com.mickyli.learn.springboot.repository;

import com.mickyli.learn.springboot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
