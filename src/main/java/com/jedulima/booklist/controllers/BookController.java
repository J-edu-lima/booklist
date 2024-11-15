package com.jedulima.booklist.controllers;

import com.jedulima.booklist.dto.BookDTO;
import com.jedulima.booklist.dto.BookMinDTO;
import com.jedulima.booklist.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<BookMinDTO> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public BookDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

}
