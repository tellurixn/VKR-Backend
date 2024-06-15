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
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            " WHERE u.user_id = :user_id " + "ORDER BY s.created_at DESC")
    List<ServiceMessage> findAll( @Param("user_id") Long user_id);
    @Query(value = "SELECT s FROM ServiceMessage s " +
            " WHERE " +
            "s.id = :id")
    ServiceMessage findByClientId(
            @Param("id") String id
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.vs_name = :vs_name")
    List<ServiceMessage> findAllByVsName(
            @Param("user_id") Long user_id,
            @Param("vs_name") String vs_name);

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE " +
            "u.user_id = :user_id AND " +
            "s.status = :status"
    )
    List<ServiceMessage> findAllByStatus(
            @Param("user_id") Long user_id,
            String status
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE " +
            "u.user_id = :user_id AND " +
            "s.message_type = :message_type"
    )
    List<ServiceMessage> findAllByMessageType(
            @Param("user_id") Long user_id,
            @Param("message_type") String message_type
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> findMessagesByTimeRange(
            @Param("user_id") Long user_id,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE " +
            "s.vs_name = :vs_name AND " +
            "s.status = :status AND " +
            "s.message_type = :message_type AND " +
            "s.created_at >= :startDate AND s.created_at <= :endDate AND " +
            "u.user_id = :user_id"
    )
    List<ServiceMessage> filterByAllParams(
            @Param("user_id") Long user_id,
            @Param("vs_name") String vs_name,
            @Param("status") String status,
            @Param("message_type") String message_type,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );


    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.vs_name = :vs_name AND " +
            "s.status = :status AND " +
            "s.message_type = :message_type"
    )
    List<ServiceMessage> filterByNameStatusType(
            @Param("user_id") Long user_id,
            @Param("vs_name") String vs_name,
            @Param("status") String status,
            @Param("message_type") String message_type
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.vs_name = :vs_name AND " +
            "s.status = :status"
    )
    List<ServiceMessage> filterByNameAndStatus(
            @Param("user_id") Long user_id,
            @Param("vs_name") String vs_name,
            @Param("status") String status
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.status = :status AND " +
            "s.message_type = :message_type AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByStatusTypeAndDate(
            @Param("user_id") Long user_id,
            @Param("status") String status,
            @Param("message_type") String message_type,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.vs_name = :vs_name AND " +
            "s.message_type = :message_type AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByNameTypeAndDate(
            @Param("user_id") Long user_id,
            @Param("vs_name") String vs_name,
            @Param("message_type") String message_type,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.vs_name = :vs_name AND " +
            "s.status = :status AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByNameStatusAndDate(
            @Param("user_id") Long user_id,
            @Param("vs_name") String vs_name,
            @Param("status") String status,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.message_type = :message_type AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByTypeAndDate(
            @Param("user_id") Long user_id,
            @Param("message_type") String message_type,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.vs_name = :vs_name AND " +
            "s.message_type = :message_type"
    )
    List<ServiceMessage> filterByNameAndType(
            @Param("user_id") Long user_id,
            @Param("vs_name") String vs_name,
            @Param("message_type") String message_type
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.status = :status AND " +
            "s.message_type = :message_type"
    )
    List<ServiceMessage> filterByStatusAndType(
            @Param("user_id") Long user_id,
            @Param("status") String status,
            @Param("message_type") String message_type
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.status = :status AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByStatusAndDate(
            @Param("user_id") Long user_id,
            @Param("status") String status,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

    @Query(value = "SELECT s FROM ServiceMessage s " +
            "JOIN UserHistory u ON u.history_uid = s.uid " +
            "WHERE u.user_id = :user_id AND " +
            "s.vs_name = :vs_name AND " +
            "s.created_at >= :startDate AND " +
            "s.created_at <= :endDate"
    )
    List<ServiceMessage> filterByNameAndDate(
            @Param("user_id") Long user_id,
            @Param("vs_name") String vs_name,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );

}
