package io.pragra.learning.june25librarybackend.entities;

import jakarta.persistence.*;

import java.util.List;

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

    String privateKey; // database

    @Transient
    Integer constBook;

    public Integer getConstBook() {
        return constBook;
    }

    public void setConstBook(Integer constBook) {
        this.constBook = constBook;
    }
    //    boolean delFG; // false, true
//    Integer delFg; // 0 , 1

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, orphanRemoval = true)
    Rating rating;
// merge -> merging sessions -  smarter approch
// refresh -> fetches data if any other session has updated same data|  2 sessions - 1 session updated data
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
    List<Review> reviews; // delete ,

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

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
