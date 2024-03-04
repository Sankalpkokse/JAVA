package com.Rest.spring_Rest.Service;

import com.Rest.spring_Rest.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface getEmployeeDAO extends JpaRepository<Employee, Integer> {
}
