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

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE s.vs_name = :vs_name")
    List<ServiceMessage> findAllByVsName(@Param("vs_name") String vs_name);

    List<ServiceMessage> findAllByStatus(String status);

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE s.message_type = :message_type"
    )
    List<ServiceMessage> findAllByMessageType(@Param("message_type") String message_type);

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> findMessagesByTimeRange(
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.vs_name = :vs_name AND " +
            "s.status = :status AND " +
            "s.message_type = :message_type AND " +
            "s.created_at >= :startDate AND s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByAllParams(
            @Param("vs_name") String vs_name,
            @Param("status") String status,
            @Param("message_type") String message_type,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.vs_name = :vs_name AND " +
            "s.status = :status AND " +
            "s.message_type = :message_type"
    )
    List<ServiceMessage> filterByNameStatusType(
            @Param("vs_name") String vs_name,
            @Param("status") String status,
            @Param("message_type") String message_type
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.vs_name = :vs_name AND " +
            "s.status = :status"
    )
    List<ServiceMessage> filterByNameAndStatus(
            @Param("vs_name") String vs_name,
            @Param("status") String status
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.status = :status AND " +
            "s.message_type = :message_type AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByStatusTypeAndDate(
            @Param("status") String status,
            @Param("message_type") String message_type,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.vs_name = :vs_name AND " +
            "s.message_type = :message_type AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByNameTypeAndDate(
            @Param("vs_name") String vs_name,
            @Param("message_type") String message_type,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.vs_name = :vs_name AND " +
            "s.status = :status AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByNameStatusAndDate(
            @Param("vs_name") String vs_name,
            @Param("status") String status,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.message_type = :message_type AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByTypeAndDate(
            @Param("message_type") String message_type,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.vs_name = :vs_name AND " +
            "s.message_type = :message_type"
    )
    List<ServiceMessage> filterByNameAndType(
            @Param("vs_name") String vs_name,
            @Param("message_type") String message_type
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.status = :status AND " +
            "s.message_type = :message_type"
    )
    List<ServiceMessage> filterByStatusAndType(
            @Param("status") String status,
            @Param("message_type") String message_type
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.status = :status AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByStatusAndDate(
            @Param("status") String status,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "WHERE " +
            "s.vs_name = :vs_name AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByNameAndDate(
            @Param("vs_name") String vs_name,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

}
