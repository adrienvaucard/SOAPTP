package com.ynov.soaptp.endpoints;

import com.ynov.soaptp.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AuthorEndpoint {

    private static final String NAMESPACE_URI = "http://ynov.com/soap/author";

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorEndpoint(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /*@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAuthorRequest")
    @ResponsePayload
    public Object getAuthor(@RequestPayload GetAuthorRequest request) {
        /// TODO
        return null;
    }*/

    /*@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAuthorsRequest")
    @ResponsePayload
    public Object getAuthors(@RequestPayload GetAuthorsRequest request) {
        /// TODO
        return null;
    }*/

    /*
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addAuthorRequest")
    @ResponsePayload
    public Object addAuthor(@RequestPayload AddAuthorRequest request) {

        /// TODO
        return null;
    }*/
}
