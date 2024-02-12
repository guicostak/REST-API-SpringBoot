package com.todolist.main.services.user;

import com.todolist.main.domain.entities.User;
import com.todolist.main.rest.dto.request.UserRegisterRequestDTO;

import java.io.IOException;

public interface UserService {
 User registerUser(UserRegisterRequestDTO registerDTO) throws Exception;
}
