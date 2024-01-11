package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    List<Employee> employeeList = getEmployeeList();

    private List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(Employee.builder()
                .id("100")
                .firstName("Teja")
                .lastName("Peddiboyina")
                .build());
        employees.add(Employee.builder()
                .id("101")
                .firstName("pandaluu")
                .lastName("kanuganti")
                .build());
        return  employees;
    }

    public Employee getEmployeeWithFullName(Employee employee) {
        String fullName = employee.getFirstName() + " "+ employee.getLastName();
        employee.setFullName(fullName);
        if(employeeList.stream().noneMatch(emp -> emp.getId().equals(employee.getId()))){
            employeeList.add(employee);
        }
        return employee;
    }

    public Employee getEmployee(String id) {
        Optional<Employee> employee = employeeList.stream().filter(emp -> emp.getId().equals(id)).findFirst();
        return employee.orElse(null);
    }
}
