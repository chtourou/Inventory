package models;


public class Client extends User {


    public Client(int id, String nom, String adress) {
        super(id, nom, adress);

    }

    @Override
    public String toString() {
        super.toString();
        return "Client{}";
    }
}
