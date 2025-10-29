package io.pragra.learning.june25librarybackend.repository;

import io.pragra.learning.june25librarybackend.dto.BookDTO;
import io.pragra.learning.june25librarybackend.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
