package com.ynov.soaptp.repositories;

import com.ynov.soaptp.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
