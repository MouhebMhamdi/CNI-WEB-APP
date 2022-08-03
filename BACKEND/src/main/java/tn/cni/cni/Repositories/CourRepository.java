package tn.cni.cni.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.cni.cni.Entities.Cour;

@Repository
public interface CourRepository extends MongoRepository<Cour, String> {
}
