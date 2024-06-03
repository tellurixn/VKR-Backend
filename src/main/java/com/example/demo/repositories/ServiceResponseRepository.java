package com.example.demo.repositories;


import com.example.demo.models.ServiceResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceResponseRepository extends CrudRepository<ServiceResponse, String> {
}
