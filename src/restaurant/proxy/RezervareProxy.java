package restaurant.proxy;

public class RezervareProxy implements IRezervare{

    private Rezervare rezervare;

    public RezervareProxy(Rezervare rezervare){
        this.rezervare=rezervare;
    }

    public RezervareProxy(int nrPersoane){
        this.rezervare = new Rezervare(nrPersoane);
    }

    @Override
    public void rezervaMasa() {
        if(rezervare.nrPersoane>3)
            System.out.println("Rezervarea nu este necesara, sunt destule mese, va rugam sa va prezentati la restaurant");
        else
            rezervare.rezervaMasa();
    }

}
