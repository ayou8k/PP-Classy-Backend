package enset.pip.virtualclass.dao;

import enset.pip.virtualclass.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module,Long> {
}
