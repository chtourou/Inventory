
public class Camion {

    int id;
    String marque;
    String matr;
    String volume;

    public Camion(  int id, String marque, String matr, String volume) {
        this.id = id;
        this.marque=marque ;
        this.matr =matr;
        this.volume=volume ;


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

    @Override
    public String toString() {
        return "Camion{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", matr='" + matr + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
