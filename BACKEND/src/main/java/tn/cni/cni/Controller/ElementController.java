package tn.cni.cni.Controller;

import org.springframework.web.bind.annotation.*;
import tn.cni.cni.Entities.Element;
import tn.cni.cni.Entities.Formation;
import tn.cni.cni.Services.ElementService;

import java.util.List;

@RestController
@RequestMapping("/api/Element")
public class ElementController {
    //private ElementService ElementService;


    @PostMapping("/add")
    public Element addElement(@RequestBody Element element) {
        return elementService.addFormation(element);
    }

    @PutMapping("/update")
    public Element updateElement(@RequestBody Element element) {

        return elementService.updateElement(element);
    }

    @GetMapping("/all")
    public List<Element> getAllElement(){
        return elementService.getAll();
    }

    @DeleteMapping("/delete/{id}")

    public void deleteElement(@PathVariable int id) {
        elementService.deleteElement(id);
    }

    @GetMapping("/get/{id}")
    public Element findById(@PathVariable int id) {
        return elementService.findById(id);
    }

}
