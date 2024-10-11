package com.katabooks.bookonline.services;

import org.springframework.stereotype.Service;

import com.katabooks.bookonline.repository.BookRepos;

import java.util.List;
import com.katabooks.bookonline.entity.Book;


@Service
public class BookService {

    private final BookRepos bookRepos;

    public BookService(BookRepos bookRepos){
          this.bookRepos = bookRepos;

    }


    public List<Book> getAllBooks() {

        return bookRepos.findAll();

    }

    public Book getBookById(Long bookId) {
        return bookRepos.findById(bookId).orElseThrow(( )-> new RuntimeException("Book not Found"));
    }

    public Book saveBook(Book book) {
        return  bookRepos.save(book);
    }
    
    public void deleteBook(Long  bookId){
        bookRepos.deleteById(bookId);
    }


}
