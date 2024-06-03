package com.example.demo.repositories;

import com.example.demo.models.ServiceRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRequestRepository extends CrudRepository<ServiceRequest, String> {

}
