package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface CompteRepository extends JpaRepository<Compte,Long> {
}
