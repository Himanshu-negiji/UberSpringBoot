package org.example.uberreviewservice.services;
import org.example.uberreviewservice.models.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    Optional<Review> findReviewById(Long id);

    List<Review> findAllReviews();

    Boolean deleteReviewById(Long id);

    Review publishReview(Review review);
}
