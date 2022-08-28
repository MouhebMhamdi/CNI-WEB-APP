package tn.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.cni.Entities.Panier;

@Repository
public interface PanierRepository extends JpaRepository<Panier, Integer> {

	static Object getNom() {
		// TODO Auto-generated method stub
		return null;
	}

}
