package com.katabooks.bookonline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katabooks.bookonline.entity.Customer;



@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
