package com.example.hr.entity;

import java.util.List;

public class SoftwareEngineer extends Employee {
    private List<String> languages;

    public SoftwareEngineer(String identity, String fullname, int salary, List<String> languages) {
        super(identity, fullname, salary);
        this.languages = languages;
    }

    public List<String> getLanguages() {
        return languages;
    }


}
