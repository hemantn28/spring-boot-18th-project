package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    //1. Create => Add

    @RequestMapping("/add_emp")
    public String add(@RequestBody Employee employee){

        employeeArrayList.add(employee);
        return "employee added successfully";

    }


    //2. Read => Get

    @RequestMapping("/get_emp")
    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    //3. Update

    @RequestMapping("/update_emp")
    public String update(){
        employeeArrayList.get(0).setName("Rajan");

        return "employee updated successfully";
    }

    //4. Delete

    @RequestMapping("/delete_emp")
    public String delete(){
        employeeArrayList.remove(0);

        return "employee deleted successfully";
    }
}
