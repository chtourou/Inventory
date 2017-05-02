package handler;

import models.Chauffeur;

import java.util.ArrayList;

public class Handler_chauffeur {

    private ArrayList<Chauffeur> chauffeurs;

    //retourner Liste des chauffeurs

    public String getListChauffeur() {
        String listchauffeur = "";
        for (Chauffeur chauffeur : chauffeurs) {
           listchauffeur+= chauffeur + "\n";
        }
        return listchauffeur;


    }
    // Ajouter un Chauffeur
    public void addchauffeur(Chauffeur insertChauffeur) {

        chauffeurs.add(insertChauffeur);
        System.out.println(chauffeurs.size());
    }

}