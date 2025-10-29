package io.pragra.learning.june25librarybackend.service;

import io.pragra.learning.june25librarybackend.dto.BookDTO;
import io.pragra.learning.june25librarybackend.entities.Book;
import io.pragra.learning.june25librarybackend.repository.BookRepo;
import io.pragra.learning.june25librarybackend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    // persist book
    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    // getAllBook
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    // delete Book
    public boolean deleteBook(Book book){
        bookRepository.delete(book);
        return true;
    }

    public List<Book> addAll(List<Book> books){
        return bookRepository.saveAll(books);
    }


}
