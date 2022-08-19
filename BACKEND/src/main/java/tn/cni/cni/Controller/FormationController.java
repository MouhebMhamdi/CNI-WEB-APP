package tn.cni.cni.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.cni.cni.Entities.Formation;
import tn.cni.cni.Services.FormationService;

import java.util.List;

@RestController
@RequestMapping("/api/Formation")
public class FormationController {

    @Autowired
    private FormationService formationService;


    @PostMapping("/add")
    public Formation addFormation(@RequestBody Formation formation) {
        return formationService.addFormation(formation);
    }

    @PutMapping("/update")
    public Formation updateFormation(@RequestBody Formation formation) {

        return formationService.updateFormation(formation);
    }

    @GetMapping("/all")
    public List<Formation> getAllFormation(){
        return formationService.getAll();
    }

    @DeleteMapping("/delete/{id}")

    public void deleteFormation(@PathVariable int id) {
        formationService.deleteFormation(id);
    }

    @GetMapping("/get/{id}")
    public Formation findById(@PathVariable int id) {
        return formationService.findById(id);
    }
}
