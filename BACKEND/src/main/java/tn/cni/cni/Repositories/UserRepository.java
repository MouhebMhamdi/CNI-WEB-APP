package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.cni.cni.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}