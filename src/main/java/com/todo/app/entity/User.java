package com.todo.app.entity;

import lombok.Data;

@Data
public class User {

    private long userId;
    private String userName;
    private String password;
    private String created_at;
    private String updated_at;
    
}
