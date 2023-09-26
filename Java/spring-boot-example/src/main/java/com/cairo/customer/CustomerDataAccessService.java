package com.cairo.customer;

import com.cairo.Main;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDao {


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


    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(c ->  c.getId().equals(id))
                .findFirst();
    }
}
