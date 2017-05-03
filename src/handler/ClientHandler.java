package handler;

import models.Client;

import java.util.ArrayList;

public class ClientHandler

{

    private String listClient;

    public ClientHandler(ArrayList<Client> listClient) {

    }

    public String getListClient() {
        return listClient;
    }

    public class ClientHandler {

        private ArrayList<Client> clients;
        private Client clientTofind;

        public ClientHandler(ArrayList<Client> clients) {

            this.clients = clients;
        }

        //retourner Liste des clients

        public String getListClient() {

            String resultat = "";

            for (int i = 0; i < clients.size(); i++) {
                resultat += clients.get(i).toString() + "\n";
            }
            return resultat;


        }
        // Ajouter un client

        public void addClient(Client insertClient) {

            clients.add(insertClient);
            System.out.println(clients.size());
        }
        // recupere un client par son id

        public Client getClientWithId(int idModif) {
            Client comercialTofind = null;
            for (int i = 0; i < clients.size(); i++) {
                Client client = clients.get(i);
                if (client.getId() == idModif) {
                    comercialTofind = client;
                    break;

                }
            }

            return clientTofind;
        }

        //supprimer client

        public void removeClient(int idClient) {
            Client clientToRemove = getClientWithId(idClient);
            if (clientToRemove != null)
                clients.remove(clientToRemove);
            else
                System.out.println("Client avec id = " + idClient + " est introuvable!");
        }


    }

    }
