package com.gjmoura.workshopmongo.services;

import com.gjmoura.workshopmongo.domain.Post;
import com.gjmoura.workshopmongo.repository.PostRepository;
import com.gjmoura.workshopmongo.repository.PostRepository;
import com.gjmoura.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> findAll() {
        return repo.findAll();
    }

    public Post findById(String id) {
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
    }

    public Post insert(Post obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }
}
