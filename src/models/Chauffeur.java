package models;

public class Chauffeur extends User {


    private String date_N;
    private String salaire;

    public Chauffeur(int id, String nom, String address, String date_N, String salaire) {
        super(id, nom, address);
        this.date_N = date_N;
        this.salaire = salaire;
    }

    public String getDate_N() {
        return date_N;
    }

    public void setDate_N(String date_N) {
        this.date_N = date_N;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Chauffeur{" +
                "date_N='" + date_N + '\'' +
                ", salaire='" + salaire + '\'' +
                '}';
    }
}
