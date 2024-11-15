package com.jedulima.booklist.dto;

import com.jedulima.booklist.entities.Book;

public record BookMinDTO(Long id, String title, Integer year, String shortDescription) {

    public BookMinDTO(Book entity) {
        this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getShortDescription());
    }
}
