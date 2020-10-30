package com.ynov.soaptp.repositories;

import com.ynov.soaptp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
