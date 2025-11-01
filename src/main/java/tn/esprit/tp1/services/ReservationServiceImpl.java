package tn.esprit.tp1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp1.entity.Reservation;
import tn.esprit.tp1.Repository.ReservationRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {  // Retire "abstract"

    private final ReservationRepository reservationRepository;  // "final" recommandé avec @AllArgsConstructor

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(String reservationId) {
        return reservationRepository.findById(reservationId)
                .orElse(null); // Évite NoSuchElementException
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void removeReservation(String reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public List<Reservation> trouverResSelonDateEtStatus(Date d, boolean b) {
        // TODO: implémenter plus tard
        return List.of();
    }
}