package com.katabooks.bookonline.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {





    @Id
    @GeneratedValue
    @Column(name ="book_id")
    private long bookId;


    @NotNull(message ="Title cannot be empty")
    private String title;
    @NotNull(message ="Author cannot be empty")
    private String author;
    @NotNull(message ="Price cannot be null")
    @Min(value =0 , message = "Price must be a positive value")
    private double price;
    @Min(value =0 , message = "Stock must be a positive value")
    private int stock;

    public long getBookId() {
        return bookId;
    }
    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    

}
