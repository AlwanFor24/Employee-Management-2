package com.example.ManajemenKaryawan1.service;

import java.util.List;

import com.example.ManajemenKaryawan1.model.Departement;
import com.example.ManajemenKaryawan1.model.Employee;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

   void retrieveEmployeeById(long id);
}
