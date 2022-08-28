package tn.cni.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.cni.Entities.Commande;
import tn.cni.Services.ServiceInterfaces.CommandeIMPL;


@RestController
@RequestMapping("Commande")
public class CommandeConroller {
	
	
	@Autowired
	private CommandeIMPL service	;
	
	
	@PostMapping("/addCommande")
	public Commande addCommande(@RequestBody Commande commande) {
		return service.saveCommande(commande);
	
	}
	@PostMapping("/addCommandes")
	public List<Commande> addCommandes(@RequestBody List<Commande> commandes) {
		return service.saveCommandes(commandes);
	}
	
	@GetMapping("/commandes")
	public List<Commande> findAllCommandes(){
		return service.getCommandes();
		
	}
	@GetMapping("/commande/{id}")
	public Commande findCommandeByUserId(@PathVariable int id) {
		return service.getCommandeById(id);
	}
	@PutMapping("/update")
	public Commande updateCommande(@RequestBody Commande commande) {
		return service.updateCommande(commande);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCommande(@PathVariable int id) {
		return service.deleteCommande(id);
		
	}
}


