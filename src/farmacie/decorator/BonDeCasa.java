package farmacie.decorator;

public class BonDeCasa implements IBon {

    String cod;
    Double pret;

    public BonDeCasa(String cod, Double pret) {
        this.cod = cod;
        this.pret = pret;
    }

    @Override
    public void printare() {
        System.out.println("Bonul: "+cod+"\nPret: "+ pret);
    }
}
