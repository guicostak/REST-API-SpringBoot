package com.todolist.main.domain.entities;

import com.todolist.main.rest.dto.request.UserRegisterRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    public User(UserRegisterRequestDTO user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
}
