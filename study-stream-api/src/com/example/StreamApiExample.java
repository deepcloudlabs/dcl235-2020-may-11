package com.example;

import com.example.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1","Jack Bauer",10_000,1956));
        employees.add(new Employee("2","Kate Austen",20_000,1990));
        employees.add(new Employee("3","James Sawyer",30_000,1991));
        employees.add(new Employee("4","Ben Linus",40_000,1973));
        employees.add(new Employee("5","Jin Kwon",50_000,1985));
        Predicate<Employee> oldEmployees = emp -> emp.getBirthYear() <= 1970;
        Predicate<Employee> largeSalary = emp -> emp.getSalary() > 30_000.;
        Predicate<Employee> filter = emp -> emp.getSalary() > 30_000. && emp.getBirthYear() <= 1970;

        var oldEmps = employees.stream()
                               //.filter(oldEmployees.and(emp -> emp.getSalary() > 30_000. && emp.getBirthYear() <= 1970))
                               .filter(oldEmployees.and(largeSalary))
                               .collect(Collectors.toList());

    }
}
