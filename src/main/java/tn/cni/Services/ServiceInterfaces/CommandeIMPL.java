package tn.cni.Services.ServiceInterfaces;

import tn.cni.Entities.Commande;

import java.util.List;

public interface CommandeIMPL {
    public Commande saveCommande(Commande commande);
    public List<Commande> saveCommandes(List<Commande> commandes);
    public List<Commande> getCommandes();
    public Commande getCommandeById(int id);
    public String deleteCommande(int id);
    public Commande updateCommande(Commande commande);

}
