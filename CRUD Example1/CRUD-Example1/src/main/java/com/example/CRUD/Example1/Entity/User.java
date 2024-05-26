package com.example.CRUD.Example1.Entity;

public class User {
    private String name;
    private char gender;
    private int id;
    private long mobile;

    public User() {
    }

    public User(String name, char gender, int id, long mobile) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
