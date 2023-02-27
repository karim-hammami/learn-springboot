package com.example.learn.model;

import java.time.LocalDateTime;

public record Todo(
        Integer id,
        String title,
        String desc,
        Status status,
        LocalDateTime created_at,
        LocalDateTime updated_at) {

}
