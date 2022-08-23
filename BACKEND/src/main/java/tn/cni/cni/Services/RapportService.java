package tn.cni.cni.Services;

import java.util.List;

import tn.cni.cni.Entities.Rapport;

public interface RapportService {
	 void addRapport(Rapport rapport);
	 void getRapport(Rapport rapport);
	 List<Rapport> getallRapports();
	 void deleteRapport(int id);
	 Rapport updateRapport(int id);

}
