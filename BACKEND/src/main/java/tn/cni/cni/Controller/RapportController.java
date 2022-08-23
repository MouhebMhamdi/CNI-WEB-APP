package tn.cni.cni.Controller;

import java.util.List;

import javax.transaction.Transactional;

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
	
    @PostMapping("add")
    public String testadd(@RequestBody Rapport rapport){
    	rapportService.addRapport(rapport);
        return "Rapport added";
    }
    
    @GetMapping("getAll")
    public List<Rapport> testgetAll(){
    	return rapportService.getallRapports();
    }
    
       
    @DeleteMapping(value="/Delete/{id}")
    public void testdelete(@PathVariable int id){
    	rapportService.deleteRapport(id);
    }
    
    @PutMapping(value="/update/{id}")
    public Rapport testupdate(@PathVariable int id,@RequestBody Rapport rapport){
    	Rapport r=rapportService.updateRapport(id,rapport);
        return r;
    }
    
	    /*public List<Rapport> getAllRapports(){
	    	return rapport.getAllRapports();
	    }*/
    
}
