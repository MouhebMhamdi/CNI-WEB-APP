package tn.cni.cni.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private String idAdmin;
    private String logo;
    private String image;
    private String text;
    private String navbar;
    private String sidebar;
    private String support;

    @ManyToOne
    // déclaration d'une table d'association
    @JoinTable(name = "element_user",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id")) //id_user
    private User users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNavbar() {
        return navbar;
    }

    public void setNavbar(String navbar) {
        this.navbar = navbar;
    }

    public String getSidebar() {
        return sidebar;
    }

    public void setSidebar(String sidebar) {
        this.sidebar = sidebar;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }
}
