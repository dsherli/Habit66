package com.example.demo.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User("Dillon",
                        "dillon.sherling@wsu.edu",
                        "Lego mAn10",
                        List.of("Running", "Reading", "Coding")));
    }
}
