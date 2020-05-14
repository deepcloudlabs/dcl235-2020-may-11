package com.example.hr.entity;

import java.util.Objects;

// DDD -> Entity ->
// 1) List/Set/Collection -> @Override (equals+hashCode) (Must)
// 2) @Override toString()
public class Employee
        implements Comparable<Employee>
{ // Inheritance
    private String identity;
    private String fullname;
    private int salary;

    public Employee(String identity) {
        this.identity = identity;
    }

    public Employee(String identity, String fullname, int salary) {
        this.identity = identity;
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // reflexive

        if (o == null || // Null check
                getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return  // transitive, symmetric, consistency
                identity.equals(employee.identity);
    }

    @Override
    public int hashCode() {
        return identity.hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "identity='" + identity + '\'' +
                ", fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        var dif = this.salary - other.salary;
        if (dif == 0.) return 0;
        return dif<0. ? -1 : +1;
    }
}
