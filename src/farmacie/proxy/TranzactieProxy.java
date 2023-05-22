package farmacie.proxy;

public class TranzactieProxy implements ITranzactie {

    private Tranzactie tranzactie;

    public TranzactieProxy(Tranzactie tranzactie){
        this.tranzactie=tranzactie;
    }

    public TranzactieProxy(boolean cuReteta){
        tranzactie= new Tranzactie(cuReteta);
    }
    @Override
    public void efectueazaTranzactie() {
        if(tranzactie.cuReteta())
            System.out.println("Tranzactia cu reteta a fost efectuata");
        else System.out.println("Tranzactia a esuat. Se poate face doar cu reteta. ");
    }
}
