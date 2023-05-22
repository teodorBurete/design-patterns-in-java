package restaurant.proxy;

public class Rezervare implements IRezervare{

    int nrPersoane;

    public Rezervare(int nrPersoane){
        this.nrPersoane=nrPersoane;
    }
    @Override
    public void rezervaMasa() {
        System.out.println("Masa a fost rezervata");
    }
}
