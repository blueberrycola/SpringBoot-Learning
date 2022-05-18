package com.example.demo.model;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/*
This is a java object that will model each user for the backend
of vue-pseudogrubhub.

For each user:
there is a unique UUID. This UUID will be the id key for each
object in MongoDB
 */
public class User {
    private final UUID id;
    private final String username;
    private final String password; //Primative and non-secure storage done for now until implemented: FIX before deployment
    private final String email;
    private final String[] starredPlaces;

    @Autowired //Test Constructor for Rest API
    public User(UUID id, String username){
        this.id = id;
        this.username = username;
        this.password = "Test";
        this.email = "Test@Test.com";
        String[] list = {"KFC", "Jalisco's Deli", "Culver's"};
        this.starredPlaces = list;
    }

    public User(UUID id,
                String username,
                String password,
                String email,
                String[] starredPlaces) {
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
        return this.username;
    }

    public String getPassword() { return password;}

    public String getEmail() {
        return email;
    }

    public String[] getStarredPlaces() {
        return starredPlaces;
    }
}
