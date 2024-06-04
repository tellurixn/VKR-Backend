package com.example.demo.models.db;


import jakarta.persistence.*;
import lombok.*;


import java.math.BigInteger;
import java.time.LocalDateTime;

@Table(name = "messages")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    BigInteger uid;//первичный ключ

    @Column(nullable = true, unique = false)
    String id;//id клинета

    @Column(nullable = false, unique = false)
    String content;//xml-строка запроса

    @Column(nullable = false, unique = false)
    String status;//статус сообщения

    @Column(nullable = false, unique = false)
    LocalDateTime created_at;//время создания

    @Column(nullable = false, unique = false)
    String vs_name;//вид сведений

    @Column(nullable = false, unique = false)
    String message_type;//тип взаимодействия

    public ServiceMessage(String id,
                          String content,
                          String status,
                          LocalDateTime created_at,
                          String vs_name,
                          String message_type){
        this.id = id;
        this.content = content;
        this.status = status;
        this.created_at = created_at;
        this.vs_name = vs_name;
        this.message_type = message_type;
    }

}
