package com.example.EmployeeManagemantSystem.repo;

import com.example.EmployeeManagemantSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>  {
}

//this is an interface class of department which extends for JpaRepository
