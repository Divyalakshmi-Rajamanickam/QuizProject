package com.divya.quiz_final.controller;

import com.divya.quiz_final.model.User;
import com.divya.quiz_final.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

//    public ResponseEntity<List<User>> getAllUsers(){
//        List<User> responseBody = service.getAllUsers();
//        ResponseEntity responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
//        return responseEntity;
//    }
//    @RequestMapping(value="/create", method= RequestMethod.POST)
//    public  ResponseEntity<User> create(@RequestBody User user) {
//        User responseBody = (User) service.create(user);
//        ResponseEntity responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
//        return responseEntity;
//    }
//
//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    public ResponseEntity<User> get(@PathVariable Long id) {
//        User responseBody = service.get(id);
//        ResponseEntity responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
//        return  responseEntity;
//    }
//
//    @RequestMapping(value="/update", method=RequestMethod.PUT)
//    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
//        User responseBody = service.update(id,user);
//        ResponseEntity responseEntity = new ResponseEntity<>(responseBody,HttpStatus.OK);
//        return responseEntity;
//    }
//
//    @RequestMapping(value="/delete", method=RequestMethod.DELETE)
//    public ResponseEntity<User> delete(@PathVariable Long id){
//        User responseBody = service.delete(id);
//        ResponseEntity responseEntity = new ResponseEntity<>(responseBody, HttpStatus.OK);
//        return responseEntity;
//    }

}
