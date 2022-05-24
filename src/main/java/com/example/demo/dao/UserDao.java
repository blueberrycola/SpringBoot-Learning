package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {
    int insertUser(User user);
    List<User> returnAllUsers();

    Optional<User> selectUserById(String unname);
    int deleteUserById(UUID id);
    int updateUserById(UUID id, User newuser);




}
