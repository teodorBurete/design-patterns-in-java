package restaurant.state;

public class Masa {

    IStare stare;
    int numarMasa;

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
        stare=null;
    }

    public void setStare(IStare stare){
        this.stare=stare;
    }
}
