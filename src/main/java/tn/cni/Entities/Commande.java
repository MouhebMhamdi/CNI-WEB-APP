package tn.cni.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande {

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    private int idParticipant;

	    private String etatDePaiement;

	    private String modeDePaiement;

	    private String session;

		
	    
}
