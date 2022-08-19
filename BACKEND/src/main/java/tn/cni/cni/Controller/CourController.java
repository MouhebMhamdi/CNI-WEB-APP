package tn.cni.cni.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.cni.cni.Entities.Cour;
import tn.cni.cni.Entities.Formation;
import tn.cni.cni.Services.CourService;

import java.util.List;

@RestController
@RequestMapping("/api/Cour")
public class CourController {
    private CourService courService;
    @PostMapping("/add")
    public Cour addCour(@RequestBody Cour cour) {
        return courService.addCour(cour);
    }

    @PutMapping("/update")
    public Cour updateCour(@RequestBody Cour cour) {

        return courService.updateCour(cour);
    }

    @GetMapping("/all")
    public List<Cour> getAllCour(){
        return courService.getAll();
    }

    @DeleteMapping("/delete/{id}")

    public void deleteCour(@PathVariable int id) {
        courService.deleteCour(id);
    }

    @GetMapping("/get/{id}")
    public Cour findById(@PathVariable int id) {
        return courService.findById(id);
    }
}
