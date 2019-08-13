package com.example.springbootdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
