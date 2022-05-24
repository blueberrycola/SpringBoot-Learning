package com.example.demo.dao;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

//Where Data Access Operations occur
@Repository("fakeDao")
public class UserDataAccess implements UserDao{
    private static List<User> DB = new ArrayList<>(); //Not actual DB, yet
    //Creates new user for DB
    @Override
    public int insertUser(User user) {
        DB.add(new User(user.getUsername(), user.getPassword(), user.getConfPassword(), user.getEmail()));
        return 1;
    }

    //Returns whole list
    @Override
    public List<User> returnAllUsers() {
        return DB;
    }
    /*
    Get a stream of List<User> filter the list for every person
    that equals the following UUID. List its First Time being spotted.
     */
    @Override
    public Optional<User> selectUserById(String uname) {
        //
        return DB.stream()
                .filter(person -> person.getUsername().equals(uname))
                .findFirst();

    }

    @Override
    public int deleteUserById(UUID id) {
        /*Optional<User> personMaybe = selectUserById(id); //Attempt to find user
        if(personMaybe.isEmpty()) {
            return 0; //Fail
        } else {
            DB.remove(personMaybe.get());
            return 1; //User Found
        }*/
        UUID foo = id;
        return 0;

    }

    @Override
    public int updateUserById(UUID id, User newuser) {
        return 0;
    }



}
