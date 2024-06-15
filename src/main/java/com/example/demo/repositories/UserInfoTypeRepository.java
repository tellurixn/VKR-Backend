package com.example.demo.repositories;

import com.example.demo.models.db.InfoType;
import com.example.demo.models.db.UserInfoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface UserInfoTypeRepository  extends JpaRepository<UserInfoType, Long> {

    @Query(value = "SELECT s FROM UserInfoType s WHERE s.user_id = :userId")
    List<UserInfoType> findAllowed(
            @Param(value = "userId") Long id
    );

    @Query(value = "SELECT s FROM UserInfoType s WHERE s.user_id != :userId")
    List<UserInfoType> findNotAllowed(
            @Param(value = "userId") Long id
    );
}
