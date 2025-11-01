package io.pragra.learning.june25librarybackend.repository;

import io.pragra.learning.june25librarybackend.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {
}
