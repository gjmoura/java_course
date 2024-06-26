package com.gjmoura.workshopmongo.domain;

import com.gjmoura.workshopmongo.dto.AuthorDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Document(collection = "post")
public class Post implements Serializable {
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    public Post() {
    }

    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        super();
        this.id = id;
        this.title = title;
        this.date = date;
        this.body = body;
        this.author = author;

    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
