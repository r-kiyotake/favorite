package com.todo.app.entity;

import lombok.Data;

@Data
public class Todo {

    private long id;
    private String title;
    private String detail;
    private int delete_flag;
    private String created_at;
    private String updated_at;

}