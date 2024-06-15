package com.example.demo.models.db;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "info_type")
@Data
public class InfoType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "environment")
    private String environment;
    @Column(name = "path")
    private String path;

    public InfoType(String name, String environment, String path) {
        this.name = name;
        this.environment = environment;
        this.path = path;
    }

    public InfoType() {

    }


}
