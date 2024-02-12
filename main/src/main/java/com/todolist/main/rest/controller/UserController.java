package com.todolist.main.rest.controller;

import com.todolist.main.rest.dto.request.UserRegisterRequestDTO;
import com.todolist.main.rest.dto.response.MessageDTO;
import com.todolist.main.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegisterRequestDTO userRequestDTO) {
        try {
            userService.registerUser(userRequestDTO);
            return ResponseEntity.ok("Usuário cadastrado com sucesso!");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new MessageDTO(ex.toString()));
        }
    }
}
