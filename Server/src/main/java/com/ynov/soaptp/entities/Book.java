package com.ynov.soaptp.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
public class Book extends com.ynov.soaptp.book.Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String isbn;

    @Column
    private String title;

    @Column
    private String language;

    @Column
    private String author;

    @Column
    private Date publication_date;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publication_date) {
        this.publication_date = publication_date;
    }
}
