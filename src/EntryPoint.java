import models.Chauffeur;
import models.Client;
import models.Comercial;

public class EntryPoint {
    public static void main(String[] args) {

        Camion camion1 = new Camion(10, "Iveco", "123 tn 1295", "2000 kg");
        Camion camion2 = new Camion(11, "Mercedess", "342 in 7654", "4000 kg");

        Chauffeur chauffeur1 = new Chauffeur(20, "Fathi","Sousse" ,"15/01/1985", "1000 DNT");
        Chauffeur chauffeur2 = new Chauffeur(21, "Bilel", "Gafsa","99/99/1986", "200 DNT");

        Comercial comercial1 = new Comercial(30, "Zied", "Mednine","99/99/1985", "200 DNT");
        Comercial comercial2 = new Comercial(31, "Mansour","sfax" ,"99/99/2001", "200 DNT");


        Client client1 = new Client(40, "Ali", "Sousse");
        Client client2 = new Client(41, "Salah", "Monastir");

        Commande commande1 = new Commande(50, "100 kg sucre", "100 litre huile", "200 kg spagetti num 2");
        Commande commande2 = new Commande(51, "120 kg sucre", "80 litre huile", "150 kg spagetti num 2");

        Factoration factoration1 = new Factoration(60, "31 avril 2017", "2200 DNT", client1, camion1, chauffeur1, comercial1);
        Factoration factoration2 = new Factoration(61, "01 mai 2017", "3000 DNT", client2, camion2, chauffeur2, comercial2);


        Stock stock = new Stock()


    }
}