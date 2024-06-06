package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class PassengerReview extends Review {
    private String PassengerReviewContent;

    private String PassengerRating;
}
