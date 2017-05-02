import models.Chauffeur;
import models.Client;
import models.Comercial;

public class Factoration {
    int id;
    String date_fac;
    String somme;
    Client client;
    Camion camion;
    Chauffeur chauffeur;
    Comercial comercial;

    public Factoration(int id, String date_fac, String somme, Client client, Camion camion, Chauffeur chauffeur, Comercial comercial) {

        this.id=id;
        this.date_fac=date_fac;
        this.somme=somme;
        this.camion=camion;
        this.client=client;
        this.chauffeur=chauffeur;
        this.comercial=comercial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_fac() {
        return date_fac;
    }

    public void setDate_fac(String date_fac) {
        this.date_fac = date_fac;
    }

    public String getSomme() {
        return somme;
    }

    public void setSomme(String somme) {
        this.somme = somme;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    public Comercial getComercial() {
        return comercial;
    }

    public void setComercial(Comercial comercial) {
        this.comercial = comercial;
    }

    @Override
    public String toString() {
        return "Factoration{" +
                "id=" + id +
                ", date_fac='" + date_fac + '\'' +
                ", somme='" + somme + '\'' +
                ", client=" + client +
                ", camion=" + camion +
                ", chauffeur=" + chauffeur +
                ", comercial=" + comercial +
                '}';
    }
}

