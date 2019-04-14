package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService userDaoService;

    //GET  /users
    //retrievAllUsers
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    //GET /users/{id}
    //retrieveUser
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = userDaoService.findOne(id);
        if(user == null)
            throw new UserNotFoundException("id-"+ id);
        return user;
    }
//Using  postman for post request and return status 201 instead of 200 status code
//For creating post mapping User class doesn't have default constructor and instead it has paramaterized constructor which becomes default
//    So, create default constructor in User class
    //Error comes like this : nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `com.in28minutes.rest.webservices.restfulwebservices.user.User` (no Creators, like default construct, exist): cannot deserialize from Object value

    //Result will be status code: 201 Created : The result has been fulfilled and resulted in a new resource being created
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = userDaoService.save(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}
