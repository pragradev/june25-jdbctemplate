package io.pragra.learning.june25librarybackend.dto;

import lombok.Data;
import org.springframework.data.annotation.Transient;

@Data
public class BookDTO {
    Integer bookId;
    String name;
    String isbn;
    String author;
    @Transient
    String lang;

    public BookDTO() {
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

    public BookDTO(Integer bookId, String name, String isbn, String author, String lang) {
        this.bookId = bookId;
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.lang = lang;
    }
}
