package tn.esprit.tp1.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp1.entity.Chambre;
import tn.esprit.tp1.entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {

}
