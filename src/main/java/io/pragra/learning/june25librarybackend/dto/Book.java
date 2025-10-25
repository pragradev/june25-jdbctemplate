package io.pragra.learning.june25librarybackend.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class Book {
    Integer bookId;
    String name;
    String isbn;
    String author;
    String lang;

    public Book() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Book(Integer bookId, String name, String isbn, String author, String lang) {
        this.bookId = bookId;
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.lang = lang;
    }
}
