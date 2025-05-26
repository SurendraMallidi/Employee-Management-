package com.employeemanagement.service;


import com.employeemanagement.dto.EmployeeRequest;
import com.employeemanagement.dto.EmployeeResponse;
import com.employeemanagement.entity.Employee;
import com.employeemanagement.mapper.EmployeeMapper;
import com.employeemanagement.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo repo;

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest request) {
        Employee employee = EmployeeMapper.toEntity(request);
        Employee savedEmployee = repo.save(employee);
        return EmployeeMapper.toResponse(savedEmployee);
    }

    @Override
    public List<EmployeeResponse> getAllEmployees() {
        List<Employee> employees = repo.findAll();
        return employees.stream()
                .map(EmployeeMapper::toResponse)
                .collect(Collectors.toList());
    }

}
