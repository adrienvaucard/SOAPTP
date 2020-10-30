package com.ynov.soaptp.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

import static javax.persistence.TemporalType.DATE;

@Entity
@Table(name = "authors")
public class Author extends com.ynov.soaptp.author.Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @OneToMany(mappedBy="author", targetEntity = Book.class)
    private Set<Book> books;
}
