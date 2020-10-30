package com.ynov.soaptp.endpoints;

import com.ynov.soaptp.book.*;
import com.ynov.soaptp.book.GetBookByIdResponse;
import com.ynov.soaptp.entities.Book;
import com.ynov.soaptp.repositories.AuthorRepository;
import com.ynov.soaptp.repositories.BookRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Endpoint
public class BookEndpoint {

    private static final String NAMESPACE_URI = "http://ynov.com/soaptp/book";

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public BookEndpoint(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }


    @PostConstruct
    public void initData() {
        //Book book1 = new Book();
        //book1.setTitle("La Bible");
        //book1.setLanguage("FR");
        //book1.setIsbn("978-0244761622");
        //book1.setAuthor();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookById")
    @ResponsePayload
    public GetBookByIdResponse getBookById() {
        GetBookByIdResponse response = new GetBookByIdResponse();
        // response.setBook(bookRepository.findById(request.getBook().getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBooksRequest")
    @ResponsePayload
    public GetAllBooksResponse getBooks(@RequestPayload GetAllBooksResponse request) {
        GetAllBooksResponse response = new GetAllBooksResponse();
        response.getBook().addAll(bookRepository.findAll());
        return null;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addBookRequest")
    @ResponsePayload
    public AddBookResponse addBook(@RequestPayload AddBookRequest request) {

        /// TODO
        return null;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteBookRequest")
    @ResponsePayload
    public DeleteBookResponse addBook(@RequestPayload DeleteBookRequest request) {

        /// TODO
        return null;
    }

    /**
     * Fonction de conversion d'objet de la base de données vers le WebService.
     *
     * @param book objet de la base de donnée à transférer
     * @return le DTO
     */
    private com.ynov.soaptp.entities.Book toDto(@NonNull Book book) {
        com.ynov.soaptp.entities.Book bookDto = new com.ynov.soaptp.entities.Book();
        /// TODO
        return null;
    }
}
