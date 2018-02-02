package io.kimberly.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee>getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/employees/{employeeNum}")
    public Employee getEmployee(@PathVariable Long employeeNum){
        return employeeService.getEmployee(employeeNum);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{employeeNum}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable Long employeeNum){
        employeeService.updateEmployee(employeeNum, employee);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{employeeNum}")
    public void deleteEmployee(@PathVariable Long employeeNum){
        employeeService.deleteEmployee(employeeNum);
    }
}
