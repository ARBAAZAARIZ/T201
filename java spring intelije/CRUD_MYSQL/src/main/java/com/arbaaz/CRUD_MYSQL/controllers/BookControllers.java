package com.arbaaz.CRUD_MYSQL.controllers;

import com.arbaaz.CRUD_MYSQL.model.Book;
import com.arbaaz.CRUD_MYSQL.services.BookServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookControllers {

    @Autowired
    BookServices bookServices;

    @GetMapping("/books")
    public ResponseEntity<?> getAllBooks(){
        return bookServices.getAllBooks();
    }

    @PostMapping("/books")
    public ResponseEntity<?> creatBook( @RequestBody @Valid Book book){
        return bookServices.createBook(book);
    }
    @GetMapping("/books/{id}")
    public ResponseEntity<?> getBookById( @PathVariable int id){
        return bookServices.getBookById(id);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBookById( @PathVariable int id){
        return bookServices.deleteBookById(id);
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<?> updateBookById(@PathVariable int id, @RequestBody Book book){
       return bookServices.updateBookById(id,book);
    }

    @GetMapping("/books/by-name")
    public ResponseEntity<?> getBookByName(@RequestParam String bookname){
        return bookServices.getBookByName(bookname);
    }
    @GetMapping("books/by-author-name")
    public ResponseEntity<?> getBookByAuthorName(String authorname){

        return bookServices.getBookByAuthorName(authorname);
    }

    @GetMapping("/books/by-name-author")
    public ResponseEntity<?> getBookNameAndAuthorName( @RequestParam String bookname,
                                                       @RequestParam String authorname){
        return bookServices.getBookNameAndAuthorName(bookname, authorname);
    }

    @GetMapping("books/by-price-lessthan")
    public ResponseEntity<?> getBookByPriceLessThan(@RequestParam double price){
        return bookServices.getBookByPriceLessThan(price);
    }

    @GetMapping("/books/bookwithoutprice/{id}")
    public ResponseEntity<?> getBookByIdWithOutPrice(@PathVariable int id){
        return bookServices.getBookByIdWithOutPrice(id);
    }
}
