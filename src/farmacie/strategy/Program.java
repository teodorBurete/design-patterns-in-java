package farmacie.strategy;

public class Program {


    public static void main(String[] args) {
        Client client1 = new Client("Alexandrescu");
        client1.setModPlata(new Cash());

        client1.plateste(20);
        client1.setModPlata(new Card());
        client1.plateste(30);
    }

}
