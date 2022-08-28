package tn.cni.cni.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 
@Entity




public class Commande {

	    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdParticipant() {
		return idParticipant;
	}
	public void setIdParticipant(int idParticipant) {
		this.idParticipant = idParticipant;
	}
	public String getEtatDePaiement() {
		return etatDePaiement;
	}
	public void setEtatDePaiement(String etatDePaiement) {
		this.etatDePaiement = etatDePaiement;
	}
	public String getModeDePaiement() {
		return modeDePaiement;
	}
	public void setModeDePaiement(String modeDePaiement) {
		this.modeDePaiement = modeDePaiement;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    private int idParticipant;
	    private String etatDePaiement;
	    private String modeDePaiement;
	    private String session;
		
	    
}
