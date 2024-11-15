package com.jedulima.booklist.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_book_list")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class BookList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
}
