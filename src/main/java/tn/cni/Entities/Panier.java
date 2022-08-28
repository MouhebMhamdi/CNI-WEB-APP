package tn.cni.Entities;

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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Panier {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFormation;
    private double prixTotal;
    private double NbreFormation;
	

	
		

}
