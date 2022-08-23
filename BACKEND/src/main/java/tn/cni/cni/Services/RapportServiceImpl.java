package tn.cni.cni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.cni.cni.Entities.Rapport;
import tn.cni.cni.Repositories.RapportRepository;

@Service
public class RapportServiceImpl  implements RapportService{

	 @Autowired
	    private RapportRepository rapportRepository;
	 @Override
	    public void addRapport(Rapport rapport) {
	        rapportRepository.save(rapport);
	    }
	 @Override
	    public void getRapport(Rapport rapport) {
	        
	    }
	    public List<Rapport> getallRapports() {
	        return rapportRepository.findAll();
	    }
	    
	   
		@Override
		public void deleteRapport(int id) {
			rapportRepository.deleteById(id);
		}
		@Override
		public Rapport updateRapport(int id) {
			return rapportRepository.findById(id).orElse(null);
			//return null;
		} 
}
