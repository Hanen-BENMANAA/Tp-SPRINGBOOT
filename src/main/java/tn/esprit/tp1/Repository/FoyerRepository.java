package tn.esprit.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp1.entity.Chambre;
import tn.esprit.tp1.entity.Foyer;

import java.io.Serializable;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long>, Serializable {
}
