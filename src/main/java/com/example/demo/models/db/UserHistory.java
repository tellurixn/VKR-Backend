package com.example.demo.models.db;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users_history")
@Data
public class UserHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_uid")
    private Long history_uid;
    @Column(name = "user_id")
    private Long user_id;

    public UserHistory() {
    }


}
