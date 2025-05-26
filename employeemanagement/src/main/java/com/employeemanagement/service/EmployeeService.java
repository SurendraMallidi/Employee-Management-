package com.employeemanagement.service;

import com.employeemanagement.dto.EmployeeRequest;
import com.employeemanagement.dto.EmployeeResponse;

import java.util.List;

public interface EmployeeService {

    public EmployeeResponse createEmployee(EmployeeRequest request);
    public List<EmployeeResponse> getAllEmployees();

}
