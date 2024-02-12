package com.todolist.main.rest.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRegisterRequestDTO {

    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
}
