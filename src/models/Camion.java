package models;

public class Camion {

    int id;
    String marque;
    String matr;
    String volume;
    Chauffeur chauffeur;

    public Camion(int id, String marque, String matr, String volume,Chauffeur chauffeur) {
        this.id = id;
        this.marque = marque;
        this.matr = matr;
        this.volume = volume;
        this.chauffeur=chauffeur;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", matr='" + matr + '\'' +
                ", volume='" + volume + '\'' +
                ", chauffeur=" + chauffeur +
                '}';
    }
}
