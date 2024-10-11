package com.katabooks.bookonline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katabooks.bookonline.entity.Customer;
// import java.util.List;
import java.util.Optional;




@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

    Optional<Customer> findByEmail(String email);

}
