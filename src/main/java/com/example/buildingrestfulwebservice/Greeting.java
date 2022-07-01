package com.example.buildingrestfulwebservice;

public class Greeting {
    private final long id;
    private final String content;
    private final int number = 5;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getNumber() {
        return number;
    }
}
