package tn.cni.cni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cni.cni.Entities.Panier;

import tn.cni.cni.Repositories.PanierRepository;


@Service
public class PanierService {
	@Autowired 
	private PanierRepository repository;
	public Panier savePanier(Panier panier) {
		return repository.save(panier); 
	}
	public List<Panier> savePaniers(List<Panier> paniers) {
		return repository.saveAll(paniers); 
	}
	public List<Panier> getPaniers(){
		return repository.findAll();
	}
	public Panier getPanierById(int id){
		return repository.findById(id).orElse(null);
	}
	public String deletePanier(int id) {
		repository.deleteById(id);
		return "Panier Removed !" +id;
	}
	public Panier updatePanier(Panier panier) {
		Panier existingPanier=repository.findById(panier.getIdFormation()).orElse(null);
		existingPanier.setPrixTotal(panier.getPrixTotal());
		return repository.save(existingPanier);
		
	}

}



