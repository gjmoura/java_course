package com.gjmoura.workshopmongo.resources;

import com.gjmoura.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>>  findAll() {
        User maria = new User("1","Maria Silva", "maria@gmail.com");
        User alex = new User("2","Alex Silva", "alex@gmail.com");

        return ResponseEntity.ok().body(new ArrayList<>(Arrays.asList(maria, alex)));
    }

}
