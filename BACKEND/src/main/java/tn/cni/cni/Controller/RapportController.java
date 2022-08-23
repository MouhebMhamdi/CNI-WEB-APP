package tn.cni.cni.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.cni.cni.Entities.Rapport;
import tn.cni.cni.Services.RapportService;

@RestController
@RequestMapping("/api/Rapport")
public class RapportController {
	@Autowired
    private RapportService rapportService;
	@Autowired
	private Rapport rapport;
	
    @PostMapping("add")
    public String testadd(@RequestBody Rapport rapport){
    	rapportService.addRapport(rapport);
        return "Rapport added";
    }
    
    @GetMapping("getAll")
    public List<Rapport> testgetAll(@PathVariable Rapport rapport){
    	return rapportService.getallRapports();
    }
    
       
    @DeleteMapping(value="/Delete")
    public void testdelete(@PathVariable int id){
    	rapportService.deleteRapport(id);
    }
    
    /*@PutMapping(value="/update/{id}")
    public String testupdate(@RequestBody @PathVariable int id,Rapport rapport){
    	Rapport r=rapportService.updateRapport(id);
    	r.setName(rapport.getName());
        return "Rapport updated";
    }*/
    
	    /*public List<Rapport> getAllRapports(){
	    	return rapport.getAllRapports();
	    }*/
    
}
