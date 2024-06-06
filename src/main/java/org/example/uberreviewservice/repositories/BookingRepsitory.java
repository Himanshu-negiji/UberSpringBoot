package org.example.uberreviewservice.repositories;
import org.example.uberreviewservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepsitory extends JpaRepository<Booking, Long> {
}
