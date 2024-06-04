package com.example.demo.repositories;

import com.example.demo.models.db.ServiceMessage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ServiceMessageRepository extends CrudRepository<ServiceMessage, String> {

    @Query(value = "SELECT s FROM ServiceMessage s WHERE s.vs_name = :vs_name")
    List<ServiceMessage> findAllByVsName(@Param("vs_name") String vs_name);
    List<ServiceMessage> findAllByStatus(String status);
    @Query(value = "SELECT s FROM ServiceMessage s WHERE s.message_type = :message_type")
    List<ServiceMessage> findAllByMessageType(@Param("message_type") String message_type);
    @Query(value = "SELECT s FROM ServiceMessage s WHERE s.created_at >= :startDate AND s.created_at <= :endDate")
    List<ServiceMessage> findMessagesByTimeRange(
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

}
