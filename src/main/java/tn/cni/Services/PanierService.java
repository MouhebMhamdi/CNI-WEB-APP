package tn.cni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cni.Entities.Panier;

import tn.cni.Repositories.PanierRepository;
import tn.cni.Services.ServiceInterfaces.PanierIMPL;


@Service
public class PanierService implements PanierIMPL {
	@Autowired 
	private PanierRepository repository;
	@Override
	public Panier savePanier(Panier panier) {
		return repository.save(panier); 
	}
	@Override
	public List<Panier> savePaniers(List<Panier> paniers) {
		return repository.saveAll(paniers); 
	}
	@Override
	public List<Panier> getPaniers(){
		return repository.findAll();
	}
	@Override
	public Panier getPanierById(int id){
		return repository.findById(id).orElse(null);
	}
	@Override
	public String deletePanier(int id) {
		repository.deleteById(id);
		return "Panier Removed !" +id;
	}
	@Override
	public Panier updatePanier(Panier panier) {
		Panier existingPanier=repository.findById(panier.getIdFormation()).orElse(null);
		existingPanier.setPrixTotal(panier.getPrixTotal());
		return repository.save(existingPanier);
		
	}

}



