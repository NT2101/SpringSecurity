package com.example.SpringSecurity.dto;


import com.example.SpringSecurity.entities.Role;
import lombok.Data;

@Data
public class RegisterDto {
    private String username;
    private String password;
    private Role role; // Add role field
}


