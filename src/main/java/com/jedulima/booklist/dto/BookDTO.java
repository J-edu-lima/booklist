package com.jedulima.booklist.dto;

import com.jedulima.booklist.entities.Book;

public record BookDTO(Long id, String title, Integer year, String genre, String imgUrl, String shortDescription) {

    public BookDTO(Book entity) {
        this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getGenre(), entity.getImgUrl(), entity.getShortDescription());
    }
}
