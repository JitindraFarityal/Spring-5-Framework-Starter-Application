package com.example.spring5.Spring5Webapp.repositories;

import com.example.spring5.Spring5Webapp.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
