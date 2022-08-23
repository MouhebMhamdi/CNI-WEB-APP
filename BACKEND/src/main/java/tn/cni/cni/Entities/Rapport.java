package tn.cni.cni.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Rapport {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String Title;
    
    private String Description;

    private String Subject;
    
    @ManyToOne
    private User users;

}