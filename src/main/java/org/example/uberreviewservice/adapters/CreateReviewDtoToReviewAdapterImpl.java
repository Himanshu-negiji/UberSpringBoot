package org.example.uberreviewservice.adapters;

import org.example.uberreviewservice.dtos.CreateReviewDto;
import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repositories.BookingRepsitory;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class CreateReviewDtoToReviewAdapterImpl implements CreateReviewDtoToReviewAdapter{

    private BookingRepsitory bookingRepsitory;

    public CreateReviewDtoToReviewAdapterImpl(BookingRepsitory bookingRepsitory) {
        this.bookingRepsitory = bookingRepsitory;
    }

    @Override
    public Review createDto(CreateReviewDto createReviewDto) {
        Optional<Booking> booking = bookingRepsitory.findById(createReviewDto.getBookingId());
        return booking.map(value -> Review.builder().
                rating(createReviewDto.getRating())
                .booking(value)
                .content(createReviewDto.getContent())
                .build()).orElse(null);
    }
}
