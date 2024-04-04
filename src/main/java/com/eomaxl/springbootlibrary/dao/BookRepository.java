package com.eomaxl.springbootlibrary.dao;

import com.eomaxl.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
