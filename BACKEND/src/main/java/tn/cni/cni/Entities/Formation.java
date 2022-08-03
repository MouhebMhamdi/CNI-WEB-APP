package tn.cni.cni.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

import lombok.Data;

import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Formation")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String idParticipant;

    private String idFormateur;

    private String titre;

    private String description;

    @Temporal(TemporalType.DATE)

    private Date date_debut;

    @Temporal(TemporalType.DATE)

    private Date date_fin;

    private int nbre_participants;

    private float prix;

    private String type;

    private String id_quiz;

    private int id_cour;



    @DBRef
    private List<Quiz>  quizzes = new ArrayList<>();

    @DBRef

    private List<Cour> cours = new ArrayList<>();


}
