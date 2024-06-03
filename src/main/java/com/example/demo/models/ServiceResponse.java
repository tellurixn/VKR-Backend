package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "mnemonic_receive")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID uid;//первичный ключ

    @Column(nullable = true, unique = false)
    String id;//id клинета

    @Column(nullable = true, unique = false)
    String node_id;//клиентский идентификатор узла информационной системы

    @Column(nullable = false, unique = false)
    String content;//xml-строка сообщения

    @Column(nullable = true, unique = false)
    String ref_id;//ссылка на начальное сообщение в последовательности

    @Column(nullable = true, unique = false)
    String ref_group_id;//идентификатор группы сообщения

    @Column(nullable = false, unique = false)
    LocalDateTime created_at;//время создания

    public ServiceResponse(String id,
                           String node_id,
                           String content,
                           String ref_id,
                           String ref_group_id,
                           LocalDateTime created_at){
        this.id = id;
        this.node_id = node_id;
        this.content = content;
        this.ref_id = ref_id;
        this.ref_group_id = ref_group_id;
        this.created_at = created_at;
    }

}
