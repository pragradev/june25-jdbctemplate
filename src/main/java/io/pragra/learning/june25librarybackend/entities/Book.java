package io.pragra.learning.june25librarybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "LIBRARY_BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer bookId;
    @Column(name = "BOOK_NAME", length = 50, nullable = false)
    String name;
    @Column(name = "ISBN_NUMBER")
    String isbn;
    @Column
    String author;
    @Column
    String lang;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", lang='" + lang + '\'' +
                '}';
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
}
