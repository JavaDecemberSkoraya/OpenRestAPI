package com.task314.task314.model;

public class User {
    private Long id;
    private String name;
    private String lastName;
    private int age;

    public User(Long id, String name, String surname, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = surname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
