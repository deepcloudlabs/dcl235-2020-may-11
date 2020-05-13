package com.example.repository;

import com.example.entity.Employee;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EmployeeReactiveRepository extends ReactiveMongoRepository<Employee,String> {
    @Query("{}")
    Flux<Employee> findAllFlux(PageRequest page);
}
