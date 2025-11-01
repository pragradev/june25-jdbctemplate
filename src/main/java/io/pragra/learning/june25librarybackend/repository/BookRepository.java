package io.pragra.learning.june25librarybackend.repository;

import io.pragra.learning.june25librarybackend.dto.BookDTO;
import io.pragra.learning.june25librarybackend.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    //select b1_0.book_id,b1_0.author,b1_0.isbn_number,
    // b1_0.lang,b1_0.book_name from library_book b1_0
    // where b1_0.author=?

    List<Book> findAllByAuthor(String author);

    // HQL - JPQL
    //@Query("SELECT b from Book b where b.author=:author and b.name=:name")
    @Query("SELECT b from Book b where b.author=?1")
    //Hibernate: select b1_0.book_id,b1_0.author,
    // b1_0.isbn_number,b1_0.lang,b1_0.book_name
    // from library_book b1_0 where b1_0.author=?
    List<Book> booksByAuthor(String author);

    //select * from library_book where author = ?
    @Query(nativeQuery = true, value = "select * from library_book where author = :author")
    List<Book> booksByAuthorBySQL(String author);
}
