package tn.cni.cni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.cni.cni.Entities.Element;
@Repository
public interface ElementRepository extends JpaRepository<Element, Integer> {
}
