package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.cni.cni.Entities.Panier;

public interface PanierRepository extends JpaRepository<Panier, Integer> {

	static Object getNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
