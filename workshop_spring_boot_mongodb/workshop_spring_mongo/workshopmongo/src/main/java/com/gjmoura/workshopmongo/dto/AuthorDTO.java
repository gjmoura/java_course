package com.gjmoura.workshopmongo.dto;

import com.gjmoura.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO() {

    }

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }
}
