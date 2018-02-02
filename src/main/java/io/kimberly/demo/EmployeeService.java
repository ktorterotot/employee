package io.kimberly.demo;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
           return employees;
        }

        public Employee getEmployee(Long employeeNum){
        return employeeRepository.findOne(employeeNum);
        }

        public void addEmployee(Employee employee){
        employeeRepository.save(employee);
        }

        public void updateEmployee(Long employeeNum, Employee employee){
        employeeRepository.save(employee);
        }

        public void deleteEmployee(Long employeeNum){
        employeeRepository.delete(employeeNum);
        }
    }

