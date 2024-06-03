package com.example.demo.models;


import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "mnemonic_send")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID uid;//первичный ключ

    @Column(nullable = true, unique = false)
    String id;//id клинета

    @Column(nullable = false, unique = false)
    String content;//xml-строка запроса

    @Column(nullable = false, unique = false)
    String status;//статус сообщения

    @Column(nullable = false, unique = false)
    LocalDateTime created_at;//время создания

    public ServiceRequest(String id,
                          String content,
                          String status,
                          LocalDateTime created_at){
        this.id = id;
        this.content = content;
        this.status = status;
        this.created_at = created_at;
    }

}
