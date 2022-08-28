package tn.cni.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.cni.Entities.Panier;
import tn.cni.Services.ServiceInterfaces.PanierIMPL;

@RestController
@RequestMapping("Panier")
public class PanierController {

	
	@Autowired
	private PanierIMPL service	;
	
	
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
