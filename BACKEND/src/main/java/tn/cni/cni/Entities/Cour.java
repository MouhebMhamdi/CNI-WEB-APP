package tn.cni.cni.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Cour")

public class Cour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String titre;

    private String video;

    private String fichier;

    private String phase;

    private String section;

    DBRef
    private Set<Formation> formations = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name="users",
            joinColumns = @JoinColumn(name="id"),
            inverseJoinColumns = @JoinColumn(name =id_user )
    )
    private Set<User> users = new HashSet<>();

}
