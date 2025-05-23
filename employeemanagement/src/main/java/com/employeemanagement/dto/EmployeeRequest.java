package com.employeemanagement.dto;

import lombok.Data;

@Data
public class EmployeeRequest {

    private String empName;
    private String empAddress;
    private Long empMobileNum;
    private String empEmail;
    private Double empSalary;

}
