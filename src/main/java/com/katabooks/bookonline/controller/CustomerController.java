package com.katabooks.bookonline.controller;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import com.katabooks.bookonline.entity.Customer;
import com.katabooks.bookonline.services.CustomerService;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    // @Autowired
    private  final CustomerService customerService;


    public CustomerController(CustomerService customerService){
        this.customerService = customerService;

    }
    

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
   
    @GetMapping("/{customerId}")
    public Customer getCustomerByIdCustomer(@PathVariable Long customerId){
       return customerService.getCustomerById(customerId);

    }
    @PostMapping
    public Customer savCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId){
        customerService.deleteCustomer(customerId);
    }

}
