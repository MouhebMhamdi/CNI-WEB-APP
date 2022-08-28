package tn.cni.Services.ServiceInterfaces;

import tn.cni.Entities.Panier;

import java.util.List;

public interface PanierIMPL {
    public Panier savePanier(Panier panier);
    public List<Panier> savePaniers(List<Panier> paniers);
    public List<Panier> getPaniers();
    public Panier getPanierById(int id);
    public String deletePanier(int id);
    public Panier updatePanier(Panier panier);
}
