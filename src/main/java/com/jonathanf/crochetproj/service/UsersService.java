package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.Users;

import java.util.List;

public interface UsersService {
    public Users saveUser(Users user);
    public List<Users> getAllUsers();
}
