package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.cni.cni.Entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}