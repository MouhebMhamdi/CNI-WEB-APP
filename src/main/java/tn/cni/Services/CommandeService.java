package tn.cni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cni.Entities.Commande;
import tn.cni.Repositories.CommandeRepository;
import tn.cni.Services.ServiceInterfaces.CommandeIMPL;

@Service
public class CommandeService implements CommandeIMPL {
	
	@Autowired 
	private CommandeRepository repository;

	@Override
	public Commande saveCommande(Commande commande) {
		return repository.save(commande); 
	}

	@Override
	public List<Commande> saveCommandes(List<Commande> commandes) {
		return repository.saveAll(commandes); 
	}
	@Override
	public List<Commande> getCommandes(){
		return repository.findAll();
	}
	@Override
	public Commande getCommandeById(int id){
		return repository.findById(id).orElse(null);
	}
	@Override
	public String deleteCommande(int id) {
		repository.deleteById(id);
		return "Commande Removed !" +id;
	}
	@Override
	public Commande updateCommande(Commande commande) {
		Commande existingCommande=repository.findById(commande.getId()).orElse(null);
		existingCommande.setEtatDePaiement(commande.getEtatDePaiement());
		return repository.save(existingCommande);
		
	}

}
