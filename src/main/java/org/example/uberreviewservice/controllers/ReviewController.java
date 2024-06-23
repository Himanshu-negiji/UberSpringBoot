package org.example.uberreviewservice.controllers;
import org.example.uberreviewservice.adapters.CreateReviewDtoToReviewAdapter;
import org.example.uberreviewservice.dtos.CreateReviewDto;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.services.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    private final CreateReviewDtoToReviewAdapter createReviewDtoToReviewAdapter;

    public ReviewController(ReviewService reviewService, CreateReviewDtoToReviewAdapter createReviewDtoToReviewAdapter) {
        this.reviewService = reviewService;
        this.createReviewDtoToReviewAdapter = createReviewDtoToReviewAdapter;
    }

    @PostMapping
    public ResponseEntity<?> publishReview(@Validated @RequestBody CreateReviewDto request) {
        Review incomingReview = this.createReviewDtoToReviewAdapter.createDto(request);
        if(incomingReview == null) {
            return new ResponseEntity<>("Invalid Arguments", HttpStatus.BAD_REQUEST);
        }
        Review review = this.reviewService.publishReview(incomingReview);
        return new ResponseEntity<>(review, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Review>> getAllReview() {
        List<Review> reviews = this.reviewService.findAllReviews();
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

//    @GetMapping("/{reviewId}") {
//        public ResponseEntity<?> findReviewById(@PathVariable Long reviewId) {
//
//        }
//    }
}
