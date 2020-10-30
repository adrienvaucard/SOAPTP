package com.ynov.soaptp.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;

@Entity
@Table(name = "books")
public class Book extends com.ynov.soaptp.book.Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String isbn;

    @Column
    private String title;

    @Column
    private String language;

    @ManyToOne(targetEntity = Author.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Author author;
}
