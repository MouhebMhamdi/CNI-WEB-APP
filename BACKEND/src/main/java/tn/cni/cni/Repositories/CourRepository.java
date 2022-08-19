package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.cni.cni.Entities.Cour;

@Repository
public interface CourRepository extends JpaRepository<Cour, Integer> {
}
