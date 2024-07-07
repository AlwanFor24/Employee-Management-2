package com.example.ManajemenKaryawan1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.ManajemenKaryawan1.model.Departement;
import com.example.ManajemenKaryawan1.model.Employee;
import com.example.ManajemenKaryawan1.repository.EmployeeRepository;
import com.example.ManajemenKaryawan1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee;
        if (optional.isPresent()) {
            employee =  optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }

   @Override
    public void retrieveEmployeeById(long id) {this.employeeRepository.findById(id);}

}