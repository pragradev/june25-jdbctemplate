package io.pragra.learning.june25librarybackend.service;

import io.pragra.learning.june25librarybackend.dto.BookDTO;
import io.pragra.learning.june25librarybackend.entities.Book;
import io.pragra.learning.june25librarybackend.repository.BookRepo;
import io.pragra.learning.june25librarybackend.repository.BookRepository;
import io.pragra.learning.june25librarybackend.repository.RatingRepo;
import io.pragra.learning.june25librarybackend.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    RatingRepo ratingRepo;
    @Autowired
    ReviewRepo reviewRepo;

    // persist book
    public Book addBook(Book book){
        // newISBN() send to Pearson
        // calculate newISBN and send to pearson
        Integer constBook = book.getConstBook();
        String isbn = book.getIsbn();
        String newIsbn = isbn+constBook;
        System.out.println("New ISBN = " + newIsbn);
        // send new Isbn to Pearson
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

    public boolean deleteBookById(Integer id){
        bookRepository.deleteById(id);
        return true;
    }

    public Optional<Book> getBookByID(Integer id){
        return bookRepository.findById(id);
    }

    public List<Book> getByAuthor(String author){
        return bookRepository.booksByAuthorBySQL(author);
    }

//    public List<Book> addAll(List<Book> books){
//        books.forEach(book -> {
//            reviewRepo.saveAll(book.getReviews());
//            ratingRepo.save(book.getRating());
//            bookRepository.save(book);
//        });
//        return books;
//    }

    public List<Book> addAll(List<Book> books){
        books.forEach(book -> bookRepository.save(book));
        return books;
    }


}
