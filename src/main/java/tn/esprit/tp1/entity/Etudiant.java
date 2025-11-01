package tn.esprit.tp1.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;

    String nomEtudiant;
    String prenomEtudiant;
    long cinEtudiant;
    Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    Set<Reservation> reservations = new HashSet<>();
    // Constructeur personnalisé utile
    public Etudiant(String nomEtudiant, String prenomEtudiant, long cinEtudiant, Date dateNaissance) {
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.cinEtudiant = cinEtudiant;
        this.dateNaissance = dateNaissance;
        this.reservations = new HashSet<>();
    }
}
