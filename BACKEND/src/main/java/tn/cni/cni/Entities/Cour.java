package tn.cni.cni.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String titre;

    private String video;

    private String fichier;

    private String phase;

    private String section;



    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })


    private Set<User> users = new HashSet<>();

    @ManyToMany(mappedBy = "cours")
    private   Set<Formation> formations;

}
