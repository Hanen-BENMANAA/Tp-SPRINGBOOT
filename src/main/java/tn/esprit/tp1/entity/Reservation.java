package tn.esprit.tp1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation implements Serializable {

    @Id
    @Column(length = 36)
    String idReservation = UUID.randomUUID().toString();

    @Temporal(TemporalType.DATE)
    Date anneeUniversitaire;

    boolean estValide;

    @ManyToOne
    @JoinColumn(name = "chambre_id")
    Chambre chambre;

    @ManyToMany
    Set<Etudiant> etudiants = new HashSet<>();

}
