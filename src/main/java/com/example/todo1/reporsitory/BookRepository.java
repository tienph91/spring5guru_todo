package com.example.todo1.reporsitory;

import com.example.todo1.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}