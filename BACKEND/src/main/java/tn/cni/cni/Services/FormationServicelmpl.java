package tn.cni.cni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.cni.cni.Entities.Formation;
import tn.cni.cni.Repositories.FormationRepository;
import tn.cni.cni.Repositories.UserRepository;

import java.util.List;
@Service
public class FormationServicelmpl implements FormationService{

    @Autowired
    private FormationRepository formationRepository;
    @Override
    public Formation addFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public Formation updateFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public void deleteFormation(int id) {

    }

    @Override
    public List<Formation> getAll() {
        return formationRepository.findAll();
    }

    @Override
    public Formation findById(int id) {
        return formationRepository.findById(null).orElse(null);
    }
}
