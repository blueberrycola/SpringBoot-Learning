package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.User;
import com.example.demo.dao.UserDao;
@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("fakeDao") UserDao userDao) {this.userDao = userDao;}

    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    public List<User> retAllUsers() {return userDao.returnAllUsers();}

    public Optional<User> getUserById(UUID id) {return userDao.selectUserById(id);}

    public int deletePerson(UUID id) {
        return userDao.deleteUserById(id);
    }

    public int updateUser(UUID id, User newuser) {return userDao.updateUserById(id, newuser);}
}
