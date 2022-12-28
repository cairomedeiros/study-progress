package com.program.crudjava.db;

import com.program.crudjava.entities.Department;
import com.program.crudjava.entities.Employee;
import com.program.crudjava.repositories.DepartmentRepository;
import com.program.crudjava.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public abstract class DbInit implements CommandLineRunner {
    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;

    public DbInit(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository){
    this.departmentRepository = departmentRepository;
    this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String...args){
        Department ti = new Department(1L,"Tecnologia");
        Department marketing = new Department(2L, "Marketing");
        Department health = new Department(3L, "Saúde");

        Employee emp1 = new Employee(1L, "Cairo", "USER",  "teste", ti);
        Employee emp2 = new Employee(2L, "Sérgio", "ADMIN", "testeadm", marketing);


        List<Department> dp = Arrays.asList(ti, marketing, health);
        List<Employee> emp = Arrays.asList(emp1, emp2);

        this.departmentRepository.saveAll(dp);
        this.employeeRepository.saveAll(emp);
    }
}
