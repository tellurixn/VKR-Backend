package com.example.demo.models.db;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_info_type")
@Data
public class UserInfoType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "info_type_id")
    private String info_type_id;

    public UserInfoType(String userId, String infoId) {
        this.user_id = userId;
        this.info_type_id = infoId;
    }

    public UserInfoType() {

    }
}
