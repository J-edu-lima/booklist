package com.jedulima.booklist.services;

import com.jedulima.booklist.dto.BookMinDTO;
import com.jedulima.booklist.entities.Book;
import com.jedulima.booklist.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<BookMinDTO> findAll() {
        List<Book> all = repository.findAll();
        return all.stream().map(BookMinDTO::new).toList();
    }
}
