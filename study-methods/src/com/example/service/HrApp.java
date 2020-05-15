package com.example.service;

import com.example.service.Employee;
import com.example.service.EmployeeService;

import java.util.Objects;
import java.util.function.Consumer;

public class HrApp {
    public static void main(String[] args) {
        // Guava Library -> Google
        EmployeeService empSrv = new EmployeeService();
        // NPE-free
        Consumer<Employee> increaseSalary = Employee::increaseSalary;
        empSrv.findEmployeeByIdentity("1")
                         // Functional Programming (Lambda Expression, Method Reference)
              .ifPresent(increaseSalary.andThen(Employee::fire));
        // NoSuchElementException
        empSrv.findEmployeeByIdentity("1")
              .get()
              .increaseSalary();
        var emp = empSrv.getEmployeeByIdentity("1");
        // if (Objects.nonNull(emp))
            emp.increaseSalary(); // NPE
    }
}
