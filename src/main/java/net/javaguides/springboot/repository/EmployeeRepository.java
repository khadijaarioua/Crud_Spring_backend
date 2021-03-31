package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

