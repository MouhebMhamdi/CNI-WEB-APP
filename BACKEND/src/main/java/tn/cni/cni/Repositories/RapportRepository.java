package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tn.cni.cni.Entities.Rapport;

@Repository
public interface RapportRepository extends JpaRepository<Rapport, Integer>{

}
