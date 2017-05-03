package handler;

import models.Camion;

import java.util.ArrayList;

public class CamionHandler {


    private ArrayList<Camion> camions;

    public CamionHandler(ArrayList<Camion> camions) {
        this.camions = camions;
    }

    //retourner Liste des camions

    public String getListCamion(){

        String resultat = "";

        for (int i = 0; i < camions.size(); i++) {
            resultat += camions.get(i).toString() + "\n";
        }
        return resultat;


    }
    // Ajouter un camion

    public void addCamion(Camion insertCamion) {

        camions.add(insertCamion);
        System.out.println(camions.size());
    }
    // recupere un camion par son id

    public Camion getCamionWithId(int idModif) {
        Camion camionTofind = null;
        for (int i = 0; i < camions.size(); i++) {
            Camion camion = camions.get(i);
            if (camion.getId() == idModif) {
                camionTofind =camion;
                break;
            }
        }
        return camionTofind;
    }

    //supprimer camion

    public void removeCamion(int idCamion) {
        Camion camionToRemove = getCamionWithId(idCamion);
        if (camionToRemove != null)
            camions.remove(camionToRemove);
        else
            System.out.println("Camion avec id = " + idCamion + " est introuvable!");
    }



}
