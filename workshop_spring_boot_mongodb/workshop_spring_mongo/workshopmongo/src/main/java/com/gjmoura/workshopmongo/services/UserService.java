package com.gjmoura.workshopmongo.services;

import com.gjmoura.workshopmongo.domain.User;
import com.gjmoura.workshopmongo.repository.UserRepository;
import com.gjmoura.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> optionUser = repo.findById(id);
        if (optionUser.isPresent()) {
            return optionUser.get();
        }

        throw new ObjectNotFoundException("Objeto nao encontrado");
    }

}
