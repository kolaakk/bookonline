package com.katabooks.bookonline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katabooks.bookonline.entity.Book;
@Repository
public interface BookRepos extends JpaRepository<Book,Long>{
    

}
