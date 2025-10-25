package io.pragra.learning.june25librarybackend.controller;

import io.pragra.learning.june25librarybackend.dto.Book;
import io.pragra.learning.june25librarybackend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@ResponseBody
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    List<Book> books = new ArrayList<>();

    //@RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping("/hello")
    public String helloController(){
        return "Hello";
    }

    @GetMapping("/get")
    public Book getBook(){
        return new Book(1,"Harry Potter","a8ywq87ysd8cysd76cta8d7fcsd8d7c","J.K.Rawling","English");

    }

    @GetMapping("/getByAuthor")
    public List<Book> getBookByAuther(@RequestParam("auth") String author){
        List<Book> bookList = books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
        return bookList;
    }

    @GetMapping("/getByAuthor/{authorDetails}")
    public List<Book> getBookByAutherByPathVar(@PathVariable("authorDetails") String author){
        List<Book> bookList = books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
        return bookList;
    }

    @PostMapping("/addAll")
    public List<Book> addBook(@RequestBody List<Book> listOfBooks){
        listOfBooks.forEach(book -> books.add(book));
        return books;
    }

    @PostMapping("/add")
    public List<Book> addBook(@RequestBody Book book){
        books.add(book);
        return books;
    }

    @GetMapping("/getAll")
    public List<Book> getAll(){
        return bookService.getAllBooks();
    }


    // mvc
}
