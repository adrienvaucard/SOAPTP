package com.ynov.soaptp.endpoints;

import com.ynov.soaptp.author.*;
import com.ynov.soaptp.book.GetBookByIdResponse;
import com.ynov.soaptp.entities.Author;
import com.ynov.soaptp.entities.Book;
import com.ynov.soaptp.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.time.LocalDateTime;

@Endpoint
public class AuthorEndpoint {

    private static final String NAMESPACE_URI = "http://ynov.com/soaptp/author";

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorEndpoint(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    public void initData() {
        Author author1 = new Author();
        author1.setFirst_name("Geoffrey");
        author1.setLast_name("Clermont");
        author1.setBirth_date(new Date(System.currentTimeMillis()));

        Author author2 = new Author();
        author2.setFirst_name("Mao");
        author2.setLast_name("Zedong");
        author2.setBirth_date(new Date(System.currentTimeMillis()));

        Author author3 = new Author();
        author3.setFirst_name("Jesus");
        author3.setLast_name("Christ");
        author3.setBirth_date(new Date(System.currentTimeMillis()));

        authorRepository.save(author1);
        authorRepository.save(author2);
        authorRepository.save(author3);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAuthorRequest")
    @ResponsePayload
    public GetAuthorByIdResponse getAuthorById(@RequestPayload GetAuthorByIdRequest request) {
        GetAuthorByIdResponse response = new GetAuthorByIdResponse();
        // response.setAuthor(authorRepository.findById(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAuthorsRequest")
    @ResponsePayload
    public GetAllAuthorsResponse getAuthors() {
        GetAllAuthorsResponse response = new GetAllAuthorsResponse();
        response.getAuthor().addAll(authorRepository.findAll());
        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addAuthorRequest")
    @ResponsePayload
    public AddAuthorRequest addAuthor(@RequestPayload AddAuthorRequest request) {
        /// TODO
        return null;
    }
}
