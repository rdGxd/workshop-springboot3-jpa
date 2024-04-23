package com.projetowebjava.projetowebjava.resources;

import com.projetowebjava.projetowebjava.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Rodrigo", "rodrigo@gmail.com", "123456", "11111111");
        return ResponseEntity.ok().body(u);
    }
}
