package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.EtudiantRepository;
import enset.pip.virtualclass.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EtudiantController {
     @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping(value = "/listEtudiants")
    public List<Etudiant> listEtudiants() {
        return etudiantRepository.findAll();
    }

    @GetMapping(value = "GetEtudiant/{id}")
    public Etudiant listEtudiants(@PathVariable(name = "id") String id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdatetEtudiant/{id}")
    public Etudiant Update(@PathVariable(name = "id") String id, @RequestBody Etudiant e) {
        e.setId(id);
        return etudiantRepository.save(e);
    }

    @PostMapping(value = "CreateEtudiant/")
    public Etudiant save(@RequestBody Etudiant e) {
        return etudiantRepository.save(e);
    }

    @DeleteMapping(value = "DeleteEtudiant/{id}")
    public void delete(@PathVariable(name = "id") String id) {
        etudiantRepository.deleteById(id);
    }
}
