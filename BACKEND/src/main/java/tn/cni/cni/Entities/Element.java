package tn.cni.cni.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String logo;
    private String image;
    private String text;
    private String navbar;
    private String sidebar;
    private String support;

    @ManyToOne
    private User users;

  }
