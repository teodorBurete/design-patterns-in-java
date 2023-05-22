package farmacie.strategy;

public class Cash implements ModPlata{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul "+numeClient+" a platit "+suma +" cash");

    }
}
