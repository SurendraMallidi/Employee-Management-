package com.employeemanagement.mapper;

import com.employeemanagement.dto.EmployeeRequest;
import com.employeemanagement.dto.EmployeeResponse;
import com.employeemanagement.entity.Employee;

public class EmployeeMapper {

    public static Employee toEntity(EmployeeRequest request){

        Employee employee = new Employee();
        employee.setEmpName(request.getEmpName());
        employee.setEmpAddress(request.getEmpAddress());
        employee.setEmpEmail(request.getEmpEmail());
        employee.setEmpSalary(request.getEmpSalary());
        employee.setEmpMobileNum(request.getEmpMobileNum());
        return employee;
    }

    public static EmployeeResponse toResponse(Employee employee){
        EmployeeResponse response = new EmployeeResponse();
        response.setEmpName(employee.getEmpName());
        response.setEmpAddress(employee.getEmpAddress());
        response.setEmpEmail(employee.getEmpEmail());
        response.setEmpSalary(employee.getEmpSalary());
        response.setEmpMobileNum(employee.getEmpMobileNum());
        return response;
    }
}
