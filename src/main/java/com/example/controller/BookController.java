package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Book;

@RestController
public class BookController {

    @RequestMapping("/getBooks")
    public void getBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        };
    }
}
