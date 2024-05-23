package com.gjmoura.workshopmongo.resources;

import com.gjmoura.workshopmongo.domain.User;
import com.gjmoura.workshopmongo.dto.UserDTO;
import com.gjmoura.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>>  findAll() {
        List<User> list = service.findAll();
        List<UserDTO> listDTO = list.stream().map(UserDTO::new).toList();


        return ResponseEntity.ok().body(listDTO);
    }

}
