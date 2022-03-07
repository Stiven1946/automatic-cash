package com.stiven1946.automaticcash.controller;

import com.stiven1946.automaticcash.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ControllerUser {

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@RequestBody UserDto user){
        return null;
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        return null;
    }

    @PostMapping("/modifyUser")
    public ResponseEntity<?> modifyUser (@RequestBody @Validated UserDto request){
        return null;
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> deleteUser (Integer documentHolder){
        return null;
    }
}
