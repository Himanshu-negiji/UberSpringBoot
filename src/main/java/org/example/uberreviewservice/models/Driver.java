package org.example.uberreviewservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Driver extends BaseModel{
    private String name;

    private String licenseNumber;

    @OneToMany(mappedBy = "driver")
    @Fetch(FetchMode.SUBSELECT) // To resolved (n+1) problem.
    private List<Booking> bookings = new ArrayList<>();
}
