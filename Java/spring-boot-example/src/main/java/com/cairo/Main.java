package com.cairo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {

    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer alex = new Customer(
                1,
                "Alex",
                "alex@gmail.com",
                26
        );

        customers.add(alex);

        Customer harry = new Customer(
                4,
                "Harry",
                "harry@gmail.com",
                29
        );

        customers.add(harry);
    }

    public static void main(String[] args) {
        System.out.println(customers);
        SpringApplication.run(Main.class, args);

    }

    @GetMapping("/api/v1/customers")
    public List<Customer> getCustomers(){
        return customers;
    }

    @GetMapping("/api/v1/customers/{customerId}")
    public Customer getCustomer(
            @PathVariable("customerId") Integer customerId){
        Customer customer = customers.stream()
                .filter(c ->  c.id.equals(customerId))
                .findFirst()
                .orElseThrow(
                        () -> new IllegalArgumentException("customer with incorret id")
                );

        return customer;
    }

    static class Customer {
        private Integer id;
        private String name;
        private String email;
        private Integer age;

        public Customer(){};

        public Customer(Integer id, String name, String email, Integer age) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.age = age;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(age, customer.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, email, age);
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
