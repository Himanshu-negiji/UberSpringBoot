package org.example.uberreviewservice.services;

import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.BookingRepsitory;
import org.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepository reviewRepository;
    private final BookingRepsitory bookingRepsitory;

    public ReviewService(ReviewRepository reviewRepository, BookingRepsitory bookingRepsitory) {
        this.reviewRepository = reviewRepository;
        this.bookingRepsitory = bookingRepsitory;
    }

    @Override
    public void run(String... args) throws Exception {
        Review r = Review.builder().content("Amazing Ride Quality").rating(4.0).build();

        Booking b = Booking.builder().review(r).startTime(new Date()).build();

        bookingRepsitory.save(b);
        reviewRepository.save(r);
    }
}
