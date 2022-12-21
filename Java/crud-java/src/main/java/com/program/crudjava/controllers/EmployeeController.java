package com.program.crudjava.controllers;

import com.program.crudjava.entities.Employee;
import com.program.crudjava.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping
    public List<Employee> findAll(){
        List<Employee> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Employee findById(@PathVariable Long id){
        Employee result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        Employee result = repository.save(employee);
        return result;
    }

    @PutMapping(value = "/change/{id}")
    public Employee change(@RequestBody Employee newEmployee, @PathVariable Long id){
        Employee oldEmployee = repository.findById(id).get();

        
            Employee employee = oldEmployee;
            employee.setName(newEmployee.getName());
            employee.setAge(newEmployee.getAge());
            repository.save(employee);
            return employee;

    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
