package com.example.hr.app;

import com.example.hr.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudyComparable {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1","Jack Bauer",10_000));
        employees.add(new Employee("2","Kate Austen",80_000));
        employees.add(new Employee("3","James Sawyer",80_000));
        employees.add(new Employee("4","Ben Linus",80_000));
        employees.add(new Employee("5","Jin Kwon",10_000));
        employees.forEach(System.out::println);
        Collections.sort(employees);
        Comparator<Employee> compareByFullNameAsc = (o1, o2) -> o1.getFullname().compareTo(o2.getFullname());
        //Collections.sort(employees, compareByFullNameAsc.reversed() );
        Comparator<Employee> compareBySalaryAsc = (e1, e2) -> e1.getSalary() - e2.getSalary();
        Comparator<Employee> compareBySalaryThenByFullname = compareBySalaryAsc.thenComparing(compareByFullNameAsc);
        //employees.sort(compareBySalaryThenByFullname);
        var sortedEmployees = employees.stream() // does not change the original collection
                                       .sorted(compareBySalaryThenByFullname)
                                       .collect(Collectors.toList());
        employees.forEach(System.out::println);
        System.out.println("============================");
        sortedEmployees.forEach(System.out::println);
    }
}
