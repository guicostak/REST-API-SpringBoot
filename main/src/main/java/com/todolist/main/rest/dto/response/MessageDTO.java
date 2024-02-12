package com.todolist.main.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDTO {

    @JsonProperty("message")
    private String message;

    public MessageDTO(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message: " + message;
    }
}

