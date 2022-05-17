package com.example.demo.model;

import java.util.UUID;

//Following the schema with the spring boot tutorial this user will be used for my web application
public class User {
    private final UUID id;
    private final String username;
    private final String password; //Primative and non-secure storage done for now until implemented: FIX before deployment
    private final String email;
    private final String[] starredPlaces;

    public User(UUID id, String username, String password, String email, String[] starredPlaces) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.starredPlaces = starredPlaces;
    }
    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() { return password;}

    public String getEmail() {
        return email;
    }

    public String[] getStarredPlaces() {
        return starredPlaces;
    }
}
