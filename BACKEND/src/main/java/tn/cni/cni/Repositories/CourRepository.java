package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.cni.cni.Entities.Cour;

@Repository
public interface CourRepository extends JpaRepository<Cour, Integer> {
}
