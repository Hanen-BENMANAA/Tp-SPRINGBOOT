package tn.esprit.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp1.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
