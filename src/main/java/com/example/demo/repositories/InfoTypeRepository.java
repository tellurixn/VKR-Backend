package com.example.demo.repositories;

import com.example.demo.models.db.InfoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InfoTypeRepository extends JpaRepository<InfoType, Long> {


}
