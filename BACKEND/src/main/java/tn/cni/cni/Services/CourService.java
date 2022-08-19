package tn.cni.cni.Services;

import tn.cni.cni.Entities.Cour;

import java.util.List;

public interface CourService {
    Cour addCour(Cour cour);

    Cour updateCour(Cour cour);

    List<Cour> getAll();

    void deleteCour(int id);

    Cour findById(int id);
}
