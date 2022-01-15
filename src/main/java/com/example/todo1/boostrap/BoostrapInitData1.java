package com.example.todo1.boostrap;

import com.example.todo1.domain.Author;
import com.example.todo1.domain.Book;
import com.example.todo1.reporsitory.AuthorRepository;
import com.example.todo1.reporsitory.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Component
@Order(1)
public class BoostrapInitData1 implements CommandLineRunner {

    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Author author = authorRepository.findAll().get(0);
        Book book = bookRepository.findAll().get(0);
        Set<Author> authors = book.getAuthors();
        System.out.println(book);
    }

    public BoostrapInitData1(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
}
