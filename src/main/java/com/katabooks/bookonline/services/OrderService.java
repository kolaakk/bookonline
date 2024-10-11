package com.katabooks.bookonline.services;

import org.springframework.stereotype.Service;

import com.katabooks.bookonline.entity.OrderBook;
import com.katabooks.bookonline.repository.BookRepos;
import com.katabooks.bookonline.repository.CustomerRepo;
import com.katabooks.bookonline.repository.OrderRepo;
import com.katabooks.bookonline.entity.Customer;
import com.katabooks.bookonline.entity.Book;

import java.util.Date;
import java.util.List;


@Service
public class OrderService {
    private final BookRepos bookRepos;
    private final OrderRepo orderRepo;
    private final CustomerRepo customerRepo;





    public OrderService( OrderRepo orderRepos,CustomerRepo customerRepo, BookRepos bookRepo){
    
    
        this.orderRepo = orderRepos;  
        this.customerRepo = customerRepo;
        this.bookRepos = bookRepo;
    }

        public OrderBook placeOrder(Long customerId, Long bookId){
          Customer customer =customerRepo.findById(customerId).orElseThrow(()-> new RuntimeException("Customer not found"));
          Book book = bookRepos.findById(bookId).orElseThrow(() -> new RuntimeException("Book not Found"));

          OrderBook order = new OrderBook();
          order.setCustomer(customer);
          order.setBook(book);
          order.setOrderDate(new Date());

         return orderRepo.save(order);


        }

        public List<OrderBook> getAllOrders(){
            return orderRepo.findAll();
        }

 }
    



