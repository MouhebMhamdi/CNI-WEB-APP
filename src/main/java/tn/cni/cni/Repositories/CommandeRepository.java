package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.cni.cni.Entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer>{

	static Object getNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
