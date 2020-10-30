package com.ynov.soaptp.repositories;

import com.ynov.soaptp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
