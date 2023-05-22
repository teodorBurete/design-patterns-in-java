package farmacie.proxy;

public class Program {


    public static void main(String[] args) {

        ITranzactie tranzactie = new Tranzactie(false);
        ITranzactie tranzactieProxy = new TranzactieProxy((Tranzactie) tranzactie);

        tranzactie.efectueazaTranzactie();
        tranzactieProxy.efectueazaTranzactie();

    }


}
