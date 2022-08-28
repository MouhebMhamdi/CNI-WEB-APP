package tn.cni.cni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cni.cni.Entities.Commande;
import tn.cni.cni.Repositories.CommandeRepository;

@Service
public class CommandeService {
	
	@Autowired 
	private CommandeRepository repository;
	
		public Commande saveCommande(Commande commande) {
		return repository.save(commande); 
	}
	public List<Commande> saveCommandes(List<Commande> commandes) {
		return repository.saveAll(commandes); 
	}
	public List<Commande> getCommandes(){
		return repository.findAll();
	}
	public Commande getCommandeById(int id){
		return repository.findById(id).orElse(null);
	}
	public String deleteCommande(int id) {
		repository.deleteById(id);
		return "Commande Removed !" +id;
	}
	public Commande updateCommande(Commande commande) {
		Commande existingCommande=repository.findById(commande.getId()).orElse(null);
		existingCommande.setEtatDePaiement(commande.getEtatDePaiement());
		return repository.save(existingCommande);
		
	}

}
