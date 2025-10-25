package io.pragra.learning.june25librarybackend.service;

import io.pragra.learning.june25librarybackend.dto.Book;
import io.pragra.learning.june25librarybackend.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    public List<Book> getAllBooks(){
        return bookRepo.getAllBooksByBeanRowMapper();
        //return bookRepo.getAllBooks();
    }
}
