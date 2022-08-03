package tn.cni.cni.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.cni.cni.Entities.Formation;

import java.util.List;
import java.util.Optional;

@Repository
public interface FormationRepository extends MongoRepository<Formation, String> {



}
