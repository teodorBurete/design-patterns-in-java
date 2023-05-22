package farmacie.proxy;

public class Tranzactie implements ITranzactie {

    private boolean cuReteta;

    public Tranzactie(boolean cuReteta) {
        this.cuReteta = cuReteta;
    }

    @Override
    public void efectueazaTranzactie() {
        if (cuReteta)
            System.out.println("Tranzactia a fost efectuata cu reteta");
        else System.out.println("Tranzactia a fost efectuata FARA reteta");
    }

    public boolean cuReteta() {
        return cuReteta;
    }
}
