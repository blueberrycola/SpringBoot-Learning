package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    private final String confPassword;
    private final String email;
    private final String[] starredPlaces;

    @Autowired //Test Constructor for Rest API
    public User(@JsonProperty("username") String username,
                @JsonProperty("password") String password,
                @JsonProperty("cpass") String confpassword,
                @JsonProperty("email") String email){
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.confPassword = confpassword;
        this.email = email;
        this.starredPlaces = null;
    }

    public User(UUID id,
                String username,
                String password,
                String confpass,
                String email,
                String[] starredPlaces) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.confPassword = confpass;
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

    public String getConfPassword() {
        return confPassword;
    }

    public String getEmail() {
        return email;
    }

    public String[] getStarredPlaces() {
        return starredPlaces;
    }
}
