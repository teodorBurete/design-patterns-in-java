package farmacie.strategy;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul "+numeClient+" a platit "+suma +" cu cardul");
    }
}
