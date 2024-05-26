package com.example.Company.Service;

import com.example.Company.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();
    public List<Employee> getAllEmployee(){
        Employee e1 = new Employee("Radha",121,"9087678986");
        Employee e2 = new Employee("Sona",321,"90987679865");

        employeeList.add(e1);
        employeeList.add(e2);
        return employeeList;
    }

    public Employee getEmployeeById(int id){

        if(employeeList==null){
            return null;
        }
        for(Employee employee :employeeList){
            if(employee.getId()==id){
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }


    public void deleteEmployeeById(int id) {
        Iterator<Employee> iterator = employeeList.iterator();
        while(iterator.hasNext())
        {
            Employee employee=iterator.next();
            if(employee.getId()==id)
            {
                iterator.remove();
                return;
            }
        }
    }

}
