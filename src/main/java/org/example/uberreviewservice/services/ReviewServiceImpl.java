package org.example.uberreviewservice.services;

import jakarta.transaction.Transactional;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService{
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review publishReview(Review review) {
        return this.reviewRepository.save(review);
    }

    @Override
    public Optional<Review> findReviewById(Long id) {
        return this.reviewRepository.findById(id);
    }

    @Override
    public List<Review> findAllReviews() {
        return this.reviewRepository.findAll();
    }

    @Override
    public Boolean deleteReviewById(Long id) {
        try {
            this.reviewRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
