package handler;

import models.Chauffeur;

import java.util.ArrayList;

public class ChauffeurHandler {

    private ArrayList<Chauffeur> chauffeurs;

    public ChauffeurHandler(ArrayList<Chauffeur> chauffeurs) {
        this.chauffeurs = chauffeurs;
    }

    //retourner Liste des chauffeurs

    public String getListChauffeur() {

        String resultat = "";

        for (int i = 0; i < chauffeurs.size(); i++) {
            resultat += chauffeurs.get(i).toString() + "\n";
        }
        return resultat;


    }
    // Ajouter un livre

    public void addChauffeur(Chauffeur insertChauffeur) {

        chauffeurs.add(insertChauffeur);
        System.out.println(chauffeurs.size());
    }
    // recupere un chauffeur par son id

    public Chauffeur getChauffeurWithId(int idModif) {
        Chauffeur chauffeurTofind = null;
        for (int i = 0; i < chauffeurs.size(); i++) {
            Chauffeur chauffeur = chauffeurs.get(i);
            if (chauffeur.getId() == idModif) {
                chauffeurTofind = chauffeur;
                break;
            }
        }
        return chauffeurTofind;
    }

    //supprimer chauffeur

    public void removeBook(int idChauffeur) {
        Chauffeur chauffeurToRemove = getChauffeurWithId(idChauffeur);
        if (chauffeurToRemove != null)
            chauffeurs.remove(chauffeurToRemove);
        else
            System.out.println("Chauffeur avec id = " + idChauffeur + " est introuvable!");
    }


}