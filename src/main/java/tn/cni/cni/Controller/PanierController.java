package tn.cni.cni.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.cni.cni.Entities.Panier;
import tn.cni.cni.Services.PanierService;

@RestController
public class PanierController {

	
	@Autowired
	private PanierService service	;
	
	
	@PostMapping("/addPanier")
	public Panier addPanier(@RequestBody Panier panier) {
		return service.savePanier(panier);
	
	}
	@PostMapping("/addPaniers")
	public List<Panier> addPaniers(@RequestBody List<Panier> paniers) {
		return service.savePaniers(paniers);
	}
	
	@GetMapping("/paniers")
	public List<Panier> findAllPaniers(){
		return service.getPaniers();
		
	}
	@GetMapping("/user/{id}")
	public Panier findUserByUserId(@PathVariable int id) {
		return service.getPanierById(id);
	}
	@PutMapping("/update")
	public Panier updateUser(@RequestBody Panier user) {
		return service.updatePanier(user);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deletePanier(id);
		
	}
}
