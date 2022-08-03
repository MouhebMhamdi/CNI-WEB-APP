package tn.cni.cni.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.cni.cni.Entities.Element;
import tn.cni.cni.Entities.Formation;

public interface ElementRepository extends MongoRepository<Element, String> {
}
