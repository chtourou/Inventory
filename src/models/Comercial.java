package models;

public class Comercial extends User{

    String Date_N;
    String salaire;



    public Comercial(int id, String nom,String adress, String Date_N, String salaire) {

        super(id,nom,adress);
        this.Date_N = Date_N;
        this.salaire = salaire;

    }


    public String getDate_N() {
        return Date_N;
    }

    public void setDate_N(String date_N) {
        Date_N = date_N;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "Date_N='" + Date_N + '\'' +
                ", salaire='" + salaire + '\'' +
                '}';
    }
}
