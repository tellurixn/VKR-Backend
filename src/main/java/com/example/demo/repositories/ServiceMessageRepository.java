package com.example.demo.repositories;

import com.example.demo.models.db.ServiceMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceMessageRepository extends CrudRepository<ServiceMessage, String> {

}
