package org.example.uberreviewservice.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.uberreviewservice.models.Review}
 */
@Value
public class CreateReviewDto implements Serializable {
    String content;
    Double rating;
    Long bookingId;
}