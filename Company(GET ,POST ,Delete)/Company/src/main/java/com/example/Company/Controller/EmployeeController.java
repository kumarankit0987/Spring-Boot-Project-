package com.example.Company.Controller;

import com.example.Company.Entity.Employee;
import com.example.Company.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //Get All Employee
    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return employeeService.getAllEmployee();
    }

    //Get Employee By Id
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    //Add Employee
    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "Employee Added Successfully";
    }

    //Delete Employee
    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
        return "Employee deleted Successfully";
    }

    //Update Employee
//    public String updateEmployeeById(@PathVariable int id){
//        employeeService.updateEmployeeById(id);
//        return "Employee Updated Successfully";
//    }

}
