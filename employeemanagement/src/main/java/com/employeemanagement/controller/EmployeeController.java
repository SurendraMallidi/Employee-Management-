package com.employeemanagement.controller;

import com.employeemanagement.dto.EmployeeRequest;
import com.employeemanagement.dto.EmployeeResponse;
import com.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeRequest request){

        EmployeeResponse response = employeeService.createEmployee(request);
        return ResponseEntity.ok(response);

    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees(){
        List<EmployeeResponse> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

}
