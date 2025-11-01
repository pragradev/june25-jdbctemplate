package io.pragra.learning.june25librarybackend.repository;

import io.pragra.learning.june25librarybackend.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends JpaRepository<Rating, Integer> {
}
