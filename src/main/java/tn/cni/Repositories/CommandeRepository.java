package tn.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.cni.Entities.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer>{

	static Object getNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
