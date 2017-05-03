package handler;


import models.Comercial;

import java.util.ArrayList;

public class ComercialHandler{

    private ArrayList<Comercial> comercials;

    public ComercialHandler(ArrayList<Comercial> comercials) {

        this.comercials = comercials;
    }

    //retourner Liste des comercials

    public String getListComercial(){

        String resultat = "";

        for (int i = 0; i < comercials.size(); i++) {
            resultat += comercials.get(i).toString() + "\n";
        }
        return resultat;


    }
    // Ajouter un comercial

    public void addComercial(Comercial insertComercial) {

        comercials.add(insertComercial);
        System.out.println(comercials.size());
    }
    // recupere un comercial par son id

    public Comercial getComercialWithId(int idModif) {
        Comercial comercialTofind = null;
        for (int i = 0; i < comercials.size(); i++) {
            Comercial comercial = comercials.get(i);
            if (comercial.getId() == idModif) {
                comercialTofind =comercial;
                break;

            }
        }

        return comercialTofind;
    }

    //supprimer comercial

    public void removeComercial(int idComercial) {
        Comercial comercialToRemove = getComercialWithId(idComercial);
        if (comercialToRemove != null)
            comercials.remove(comercialToRemove);
        else
            System.out.println("Comercial avec id = " + idComercial + " est introuvable!");
    }



}


















