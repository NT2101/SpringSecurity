package com.example.SpringSecurity.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role; // Sử dụng EnumType.STRING để lưu enum dưới dạng chuỗi
}
