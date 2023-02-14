package com.program.crudjava.controllers;

import com.program.crudjava.entities.Employee;
import com.program.crudjava.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

        if(result != null){
            return result;
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        Employee result = repository.save(employee);
        return result;
    }

    @PutMapping(value = "/change/{id}")
    public Employee change(@RequestBody Employee newEmployee, @PathVariable Long id){
        Employee oldEmployee = repository.findById(id).get();

        if(oldEmployee != null){
            Employee employee = oldEmployee;
            employee.setName(newEmployee.getName());
            employee.setRoles(newEmployee.getRoles());
            employee.setPassword(newEmployee.getPassword());
            repository.save(employee);
            return employee;
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }


    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
