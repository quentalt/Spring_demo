package com.quentinfou.demoSpringFramework.model;

import java.time.LocalDateTime;

public class Message {
    private String author;
    private LocalDateTime timeStamp;
    private String message;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message (String author, String message) {
        this.timeStamp = LocalDateTime.now();
        this.author = author;
        this.message = message;
    }

    public Message() {

    }


}
