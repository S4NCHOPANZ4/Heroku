package io.spring.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.spring.pma.dao.EmployeeRepository;
import io.spring.pma.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public String displayEmployees(Model model){
        List<Employee> employees = empRepo.findAll();
        model.addAttribute("employees", employees);

        return "employees/list-employees";
    }

    @GetMapping("/new")
    public String displayEmployeeForm(Model model){
        // Employee someEmployee = new Employee();
        model.addAttribute("anything", new Employee());
        return "employees/new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee){
        empRepo.save(employee);
        return "redirect:/employees";
    }
}
