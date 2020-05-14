package com.example.hr.app;

import com.example.hr.entity.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HrApp {
    public static void main(String[] args) {
        Employee jack = new Employee("12345678910","Jack Bauer",10_000);
        Set<Employee> employees = new HashSet<>();
        List<Employee> emps = new ArrayList<>();
        System.out.println(jack);
        employees.add(jack); // hired
        // jack -> jack.hashCode() -> int (identity) -> bucket
        emps.add(jack);
        // do some processing



        // now look for jack
        System.out.println(employees.contains(new Employee("12345678910","Jack Bauer",10_000)));
        System.out.println(emps.contains(new Employee("12345678910","Jack Bauer",10_000)));
    }
}
