package com.jedulima.booklist.repositories;

import com.jedulima.booklist.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
