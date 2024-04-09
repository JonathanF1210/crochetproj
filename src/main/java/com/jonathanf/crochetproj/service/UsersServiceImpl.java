package com.jonathanf.crochetproj.service;

import com.jonathanf.crochetproj.model.Users;
import com.jonathanf.crochetproj.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

}
