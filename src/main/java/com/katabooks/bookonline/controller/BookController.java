package com.katabooks.bookonline.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.katabooks.bookonline.services.BookService;
import java.util.List;
import com.katabooks.bookonline.entity.Book;

@RestController
@RequestMapping("/api/books")
public class BookController {

private final BookService bookService;

public BookController(BookService bookService){
    this.bookService = bookService;
}

@GetMapping
public List<Book> getAllBooks(){

    return bookService.getAllBooks();

}

@GetMapping("/{bookId}")
public Book getBookById(@PathVariable Long bookId){

    return bookService.getBookById(bookId);
}


@PostMapping
public Book saveBook(@RequestBody Book book){
    return bookService.saveBook(book);
}
@DeleteMapping("/{bookId}")
public void deleteBook(@PathVariable Long bookId){
    bookService.deleteBook(bookId);
}


}
