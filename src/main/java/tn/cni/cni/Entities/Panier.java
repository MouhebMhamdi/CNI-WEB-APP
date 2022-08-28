package tn.cni.cni.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity



public class Panier {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFormation;
    private double prixTotal;
    private double NbreFormation;
	
	 public int getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	public double getNbreFormation() {
		return NbreFormation;
	}
	public void setNbreFormation(double nbreFormation) {
		NbreFormation = nbreFormation;
	}
	
		

}
