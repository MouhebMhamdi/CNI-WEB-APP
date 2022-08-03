package tn.cni.cni.Services;

import tn.cni.cni.Entities.Formation;

import java.util.List;

public interface FormationService {

    public Formation addFormation(Formation formation);

    public Formation updateFormation(Formation formation);

    public void deleteFormation(Long id);

    public List<Formation> getAll();

    public Formation findById( Long id);

}
