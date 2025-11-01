package tn.esprit.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp1.entity.Bloc;
import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findAllByFoyerIsNull();
    List<Bloc> findAllByNomBlocAndCapaciteBloc(String nomBloc, long capaciteBloc);
}
