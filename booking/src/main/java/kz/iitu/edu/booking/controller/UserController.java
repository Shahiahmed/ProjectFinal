package kz.iitu.edu.booking.controller;

import kz.iitu.edu.booking.model.User;
import kz.iitu.edu.booking.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService service;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public void createUser(String username, String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        service.create(user);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody User user){
        service.create(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return service.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

}
