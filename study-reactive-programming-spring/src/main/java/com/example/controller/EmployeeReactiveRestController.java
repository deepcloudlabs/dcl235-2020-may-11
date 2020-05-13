package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestScope
@RequestMapping("/employees")
@CrossOrigin
// Adapter
public class EmployeeReactiveRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("{identity}")
    public Mono<Employee> getEmpByIdentity(@PathVariable String identity){
        return employeeService.findEmployeeByIdentity(identity);
    }

    @GetMapping
    public Flux<Employee> getEmps(@RequestParam int page,@RequestParam int size){
        return employeeService.findEmployees(page,size);
    }
}
