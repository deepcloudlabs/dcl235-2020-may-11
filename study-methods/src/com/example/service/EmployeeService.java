package com.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class EmployeeService {
    public Optional<Employee> findEmployeeByIdentity(String identity){
        requireNonNull(identity); // validation
        return Optional.empty(); // null
    }
    public List<Employee> findEmployees(int ageFrom,int ageTo){
        return Collections.emptyList(); // Flyweight Pattern
        // return new ArrayList<>();
    }
    public Employee getEmployeeByIdentity(String identity){
        requireNonNull(identity); // validation
        return null;
    }
}

class Employee {
    public void increaseSalary(){}
    public void fire(){}
}