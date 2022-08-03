package tn.cni.cni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.cni.cni.Entities.Formation;
import tn.cni.cni.Repositories.FormationRepository;
import tn.cni.cni.Repositories.UserRepository;

import java.util.List;

public class FormationServicelmpl implements FormationService{

    @Autowired
    private FormationRepository formationRepository;
    @Override
    public Formation addFormation(Formation formation) {
        return FormationRepository.save(formation);
    }

    @Override
    public Formation updateFormation(Formation formation) {
        return FormationRepository.save(formation);
    }

    @Override
    public void deleteFormation(Long id) {

    }

    @Override
    public List<Formation> getAll() {
        return FormationRepository.findAll();
    }

    @Override
    public Formation findById(Long id) {
        return FormationRepository.findById(null).orElse(null);
    }
}
