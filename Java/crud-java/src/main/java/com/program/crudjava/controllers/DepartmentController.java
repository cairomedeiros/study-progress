package com.program.crudjava.controllers;

import com.program.crudjava.entities.Department;
import com.program.crudjava.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping
    public List<Department> findAll(){
        List<Department> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Department findById(@PathVariable Long id){
        Department result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Department create(@RequestBody Department department){
        Department result = repository.save(department);
        return result;
    }

    @PutMapping(value = "/changeDep/{id}")
    public Department change(@PathVariable Long id,@RequestBody Department newDepartment){
        Department result = repository.findById(id).get();

        Department department = result;
        department.setName(newDepartment.getName());
        repository.save(department);
        return department;
    }

    @DeleteMapping(value = "/deleteDep/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
