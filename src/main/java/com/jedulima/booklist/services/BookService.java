package com.jedulima.booklist.services;

import com.jedulima.booklist.dto.BookDTO;
import com.jedulima.booklist.dto.BookMinDTO;
import com.jedulima.booklist.entities.Book;
import com.jedulima.booklist.repositories.BookRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    @Transactional(readOnly = true)
    public List<BookMinDTO> findAll() {
        List<Book> all = repository.findAll();
        return all.stream().map(BookMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public BookDTO findById(Long id) {
        Optional<Book> book = repository.findById(id);
        return new BookDTO(book.orElseThrow());
    }
}
