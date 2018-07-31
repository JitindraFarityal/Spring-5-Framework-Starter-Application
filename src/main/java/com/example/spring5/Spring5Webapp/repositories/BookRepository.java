package com.example.spring5.Spring5Webapp.repositories;

import com.example.spring5.Spring5Webapp.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
