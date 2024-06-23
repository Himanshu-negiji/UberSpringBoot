package org.example.uberreviewservice.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.uberreviewservice.models.Review}
 */
@Value
public class ReviewDto implements Serializable {
    long id;
    String content;
    Double rating;
}