package com.gasdetectionregisterydata.dockerdemo;

import com.gasdetectionregisterydata.dockerdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    private UserRepo repo;

    @GetMapping("/hello")
    public String test() {
        return  "hello world";
    }

    @PostMapping("/create/{name}/{password}")
    public String post(@PathVariable("name") String name, @PathVariable("password") String password) {

        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        repo.save(user);
        return "saved successfully";
    }
}
