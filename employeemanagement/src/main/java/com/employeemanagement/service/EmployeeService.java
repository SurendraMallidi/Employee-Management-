package com.employeemanagement.service;

import com.employeemanagement.dto.EmployeeRequest;
import com.employeemanagement.dto.EmployeeResponse;

public interface EmployeeService {

    public EmployeeResponse createEmployee(EmployeeRequest request);

}
