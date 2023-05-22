package restaurant.flyweight;

public class ConcreteFlyweightClient implements FlyweightClient {

    private String numeClient;
    private String numarTelefon;
    private String email;

    //.. much more

    public ConcreteFlyweightClient(String numeClient, String numarTelefon, String email) {
        this.email=email;
        this.numeClient=numeClient;
        this.numarTelefon=numarTelefon;
    }

    @Override
    public void tiparire(Rezervare rezervare) {
        System.out.println(this + " " + rezervare);
    }
}
