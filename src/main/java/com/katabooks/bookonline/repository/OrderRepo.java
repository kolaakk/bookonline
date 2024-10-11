package com.katabooks.bookonline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katabooks.bookonline.entity.OrderBook;




@Repository
public interface OrderRepo extends JpaRepository<OrderBook,Long>{

}
