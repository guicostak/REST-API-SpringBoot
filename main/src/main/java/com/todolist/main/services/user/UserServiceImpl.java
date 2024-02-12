package com.todolist.main.services.user;

import com.todolist.main.domain.entities.User;
import com.todolist.main.respositories.UserRepository;
import com.todolist.main.rest.dto.request.UserRegisterRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(UserRegisterRequestDTO registerDTO) throws Exception {
        if(userRepository.existsUserByEmail(registerDTO.getEmail())) {
            throw new Exception("Email já cadastrado");
        }

        final var user = new User(registerDTO);
        return userRepository.save(user);
    }
}
