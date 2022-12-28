package com.program.crudjava.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Username;

    private String Roles;
    private String Password;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee(){}

    public Employee(Long id, String username, String roles, String password, Department department) {
        Id = id;
        Username = username;
        Roles = roles;
        Password = password;
        this.department = department;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Username;
    }

    public void setName(String username) {
        Username = username;
    }

    public String getRoles() {
        return Roles;
    }

    public void setRoles(String roles) {
        Roles = roles;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
