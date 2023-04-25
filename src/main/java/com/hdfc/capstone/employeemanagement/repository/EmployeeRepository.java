package com.hdfc.capstone.employeemanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.capstone.employeemanagement.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
