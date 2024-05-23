package com.gjmoura.workshopmongo.config;

import com.gjmoura.workshopmongo.domain.User;
import com.gjmoura.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... arg) throws Exception {
        userRepository.deleteAll();

        List<User> users = Arrays.asList(
                new User(null, "Maria Brown", "maria@gmail.com"),
                new User(null, "Alex Green", "alex@gmail.com"),
                new User(null, "Bob Grey", "bob@gmail.com")
        );

        userRepository.saveAll(users);

    }
}
