package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface ModuleRepository extends JpaRepository<Module,Long> {
}
