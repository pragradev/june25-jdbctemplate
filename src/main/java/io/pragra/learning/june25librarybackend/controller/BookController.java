package io.pragra.learning.june25librarybackend.controller;

import io.pragra.learning.june25librarybackend.dto.BookDTO;
import io.pragra.learning.june25librarybackend.entities.Book;
import io.pragra.learning.june25librarybackend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;


    //@RequestMapping(method = RequestMethod.GET, path = "/hello")
//    @GetMapping("/hello")
//    public String helloController(){
//        return "Hello";
//    }
//
//    @GetMapping("/get")
//    public BookDTO getBook(){
//        return new BookDTO(1,"Harry Potter","a8ywq87ysd8cysd76cta8d7fcsd8d7c","J.K.Rawling","English");
//
//    }
//
//    @GetMapping("/getByAuthor")
//    public List<BookDTO> getBookByAuther(@RequestParam("auth") String author){
//        List<BookDTO> bookDTOList = bookDTOS.stream().filter(bookDTO -> bookDTO.getAuthor().equals(author)).collect(Collectors.toList());
//        return bookDTOList;
//    }

//    @GetMapping("/getByAuthor/{authorDetails}")
//    public List<BookDTO> getBookByAutherByPathVar(@PathVariable("authorDetails") String author){
//        List<BookDTO> bookDTOList = bookDTOS.stream().filter(bookDTO -> bookDTO.getAuthor().equals(author)).collect(Collectors.toList());
//        return bookDTOList;
//    }

//    @PostMapping("/addAll")
//    public List<BookDTO> addBook(@RequestBody List<BookDTO> listOfBookDTOS){
//        listOfBookDTOS.forEach(bookDTO -> bookDTOS.add(bookDTO));
//        return bookDTOS;
//    }

    @PostMapping("/addAll")
    public List<Book> addAll(@RequestBody List<Book> books){
        return bookService.addAll(books);
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/getAll")
    public List<Book> getAll(){
        return bookService.getAllBooks();
    }

    @DeleteMapping("/delete")
    public boolean deleteBook(Book book){
        return bookService.deleteBook(book);
    }


    // mvc
}
