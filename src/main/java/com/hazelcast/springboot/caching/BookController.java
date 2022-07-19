package com.hazelcast.springboot.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity getBookNameByIsbn(@RequestParam("isbn") String isbn, @RequestParam(value = "name", required = false) String name) {
        return ResponseEntity.ok(bookService.getBookNameByIsbn(isbn, name));
    }
}

