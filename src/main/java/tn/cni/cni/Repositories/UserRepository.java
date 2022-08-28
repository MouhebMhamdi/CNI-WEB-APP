package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.cni.cni.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	static Object getNom() {
		// TODO Auto-generated method stub
		return null;
	}
	
}