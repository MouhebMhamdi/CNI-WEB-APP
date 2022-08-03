package tn.cni.cni.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Element")
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String idAdmin;
    private String logo;
    private String image;
    private String text;
    private String navbar;
    private String sidebar;
    private String support;

}
