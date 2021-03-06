package enset.pip.virtualclass.web;

import enset.pip.virtualclass.dao.Publication_DevoirRepository;
import enset.pip.virtualclass.entities.Publication_Devoir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Publication_DevoirController {
    @Autowired
    private Publication_DevoirRepository publication_DevoirRepository;

    @GetMapping(value = "/listDevoirs")
    public List<Publication_Devoir> listPublication_Devoirs() {
        return publication_DevoirRepository.findAll();
    }

    @GetMapping(value = "GetDevoir/{id}")
    public Publication_Devoir listPublication_Devoirs(@PathVariable(name = "id") Long id) {
        return publication_DevoirRepository.findById(id).orElse(null);
    }

    @PutMapping(value = "UpdateDevoir/{id}")
    public Publication_Devoir Update(@PathVariable(name = "id") Long id, @RequestBody Publication_Devoir e) {
        e.setId(id);
        return publication_DevoirRepository.save(e);
    }

    @PostMapping("/CreateDevoir")
    public Publication_Devoir save(@RequestBody Publication_Devoir e) {
        return publication_DevoirRepository.save(e);
    }

    @DeleteMapping(value = "/DeleteDevoir/{id}")
    public void delete(@PathVariable Long id){
        publication_DevoirRepository.deleteById(id);
    }

}
