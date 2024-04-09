package com.jonathanf.crochetproj.Controller;

import com.jonathanf.crochetproj.model.Users;
import com.jonathanf.crochetproj.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/add")
    public String add(@RequestBody Users user){
        usersService.saveUser(user);
        return "New user was successfully added";
    }

    @GetMapping("/getAll")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }
}
