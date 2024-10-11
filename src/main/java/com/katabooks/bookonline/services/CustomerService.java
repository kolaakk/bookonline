package com.katabooks.bookonline.services;

import com.katabooks.bookonline.repository.CustomerRepo;
import java.util.List;

import org.springframework.stereotype.Service;

import com.katabooks.bookonline.entity.Customer;


@Service
public class CustomerService {


    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }



    public List<Customer> getAllCustomers(){

        return customerRepo.findAll();
    }
    
    public Customer getCustomerById(Long customerId){

        return customerRepo.findById(customerId).orElseThrow(() -> new RuntimeException("Customer not found") );
    }

   public Customer saveCustomer(Customer customer){
       
    return customerRepo.save(customer);

   }

   public void deleteCustomer(Long customerId){
    customerRepo.deleteById(customerId);

   }
   public boolean emailExists(String email) { 
    return customerRepo.findByEmail(email).isPresent(); }

}
