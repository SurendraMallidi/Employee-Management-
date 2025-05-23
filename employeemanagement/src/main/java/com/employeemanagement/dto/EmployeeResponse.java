package com.employeemanagement.dto;

import lombok.Data;

@Data
public class EmployeeResponse {

    private String empName;
    private String empAddress;
    private Long empMobileNum;
    private String empEmail;
    private Double empSalary;

}
