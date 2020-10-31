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
import javax.swing.text.html.Option;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Optional;

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
        //authorRepository.deleteAll();
        Author author1 = new Author();
        author1.setFirstName("Idriss");
        author1.setLastName("Aberkane");
        authorRepository.save(author1);

        Author author2 = new Author();
        author2.setFirstName("Mao");
        author2.setLastName("Zedong");
        authorRepository.save(author2);

        Author author3 = new Author();
        author3.setFirstName("Jesus");
        author3.setLastName("Christ");
        authorRepository.save(author3);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAuthorByIdRequest")
    @ResponsePayload
    public GetAuthorByIdResponse getAuthorById(@RequestPayload GetAuthorByIdRequest request) {
        GetAuthorByIdResponse response = new GetAuthorByIdResponse();
        Optional<Author> author = authorRepository.findById(request.getId());
        response.setAuthor(author.get());
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
