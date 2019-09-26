/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.controllers;

import com.blog.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eduardo.lopes
 */
@RestController
public class UserController {
    
    @PostMapping(path = "/register")
    public ResponseEntity<User> registerUser() {
        User user = new User();
        return ResponseEntity.ok(user);
    }
    
    @PutMapping(path = "/update")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
        return ResponseEntity.ok(user);
    }
    
    @PutMapping(path = "/delete")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping(path = "/login")
    public String loginUser() {
        return "Login";
    }
    
    @GetMapping()
    public String getUsers() {
        return "lista users";
    }
    
    @GetMapping(path = "/{id}")
    public String searchUserById(@PathVariable Long id) {
        return "user";
    }
    
    @GetMapping(path = "/{userName}")
    public String searchUserByUserName(@PathVariable String userName) {
        return "User";
    }
    
    @GetMapping(path = "/{name}")
    public String searchUserByName(String name) {
        return "nome";
    }
}
