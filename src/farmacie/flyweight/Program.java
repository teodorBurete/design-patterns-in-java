package farmacie.flyweight;

public class Program {

    public static void main(String[] args) {

        ClientFactory clientFactory = new ClientFactory();

        Reteta reteta = new Reteta(1,100.5,3);
        Reteta reteta1 = new Reteta(2,85.,8);
        Reteta reteta2 = new Reteta(3,22.85,9);

        IClientFlyweight client1 = clientFactory.getClient("Pizdulescu");
        client1.printare(reteta);

        IClientFlyweight client2 = clientFactory.getClient("Cracescu");
        client2.printare(reteta1);
        client1.printare(reteta2);
    }
}
