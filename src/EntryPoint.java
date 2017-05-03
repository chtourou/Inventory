import handler.CamionHandler;
import handler.ChauffeurHandler;
import handler.ComercialHandler;
import models.Camion;
import models.Chauffeur;
import models.Client;
import models.Comercial;

import java.util.ArrayList;

public class EntryPoint {
    public static void main(String[] args) {



        // Chaffeur

        Chauffeur chauffeur1 = new Chauffeur(20, "Fathi","Sousse" ,"15/01/1985", "1000 DNT");
        Chauffeur chauffeur2 = new Chauffeur(21, "Bilel", "Gafsa","99/99/1986", "200 DNT");
        ArrayList<Chauffeur> ListChauffeur = new ArrayList<>();
        ListChauffeur.add(chauffeur1);
        ListChauffeur.add(chauffeur2);

        ChauffeurHandler chauffeurHandler=new ChauffeurHandler(ListChauffeur);
       String result= chauffeurHandler.getListChauffeur();
       System.out.println(result);


        // Camion

        Camion camion1 = new Camion(10, "Iveco", "123 tn 1295", "2000 kg",chauffeur1);
        Camion camion2 = new Camion(11, "Mercedess", "342 in 7654", "4000 kg",chauffeur2);

        ArrayList<Camion> ListCamion= new ArrayList<>();
        ListCamion.add(camion1);
        ListCamion.add(camion2);

        CamionHandler camionHandler=new CamionHandler(ListCamion);
        String resultat= camionHandler.getListCamion();
        System.out.println(resultat);


        // Comercial

        Comercial comercial1 = new Comercial(30, "Zied", "Mednine","99/99/1985", "200 DNT");
        Comercial comercial2 = new Comercial(31, "Mansour","sfax" ,"99/99/2001", "200 DNT");

        ArrayList<Comercial> ListComercial= new ArrayList<>();
        ListComercial.add(comercial1);
        ListComercial.add(comercial2);


        ComercialHandler comercialHandler=new ComercialHandler(ListComercial);
        resultat = comercialHandler.getListComercial();
        System.out.println(resultat);


        // Client

        Client client1 = new Client(40, "Ali", "Sousse");
        Client client2 = new Client(41, "Salah", "Monastir");
        ArrayList<Client> ListClient= new ArrayList<>();


        //Commande

        Commande commande1 = new Commande(50, "100 kg sucre", "100 litre huile", "200 kg spagetti num 2");
        Commande commande2 = new Commande(51, "120 kg sucre", "80 litre huile", "150 kg spagetti num 2");


        //Factoration

        Factoration factoration1 = new Factoration(60, "31 avril 2017", "2200 DNT", client1, camion1, chauffeur1, comercial1);
        Factoration factoration2 = new Factoration(61, "01 mai 2017", "3000 DNT", client2, camion2, chauffeur2, comercial2);

        //Stock
        Stock stock = new Stock("10000 kg sucre","1500 litre huile","20000 kg spagetti");






    }
}