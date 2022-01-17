package com.example.todo1.boostrap;

import com.example.todo1.domain.Author;
import com.example.todo1.domain.Book;
import com.example.todo1.domain.Publisher;
import com.example.todo1.reporsitory.AuthorRepository;
import com.example.todo1.reporsitory.BookRepository;
import com.example.todo1.reporsitory.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Order(0)
public class BoostrapInitData implements CommandLineRunner {

    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {

        // insert author
        Author author = new Author();
        author.setFirstName("tien");
        author.setLastName("pham hoang");
        authorRepository.save(author);

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        // insert book
        Book book = new Book();
        book.setTitle("xxx");
        book.setIsbn("1998");
        Set<Book> books = new HashSet<>();
        books.add(book);

        Set<Author> authors = new HashSet<>();
        authors.add(author);
        book.setAuthors(authors);
        book.setPublisher(publisher);
        publisher.getBook().add(book);

        bookRepository.save(book);
        publisherRepository.save(publisher);

    }

    public BoostrapInitData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
}
