package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
// Reactive ?
public class EmployeeService {
    @Autowired
    private EmployeeReactiveRepository employeeRepository;

    public Mono<Employee> findEmployeeByIdentity(String identity) {
        return employeeRepository.findById(identity);
    }

    public Flux<Employee> findEmployees(int page, int size) {
        return employeeRepository.findAllFlux(PageRequest.of(page,size));
    }
}
