package restaurant.flyweight;

public class Program {
    public static void main(String[] args) {

        Rezervare rezervare1 = new Rezervare(1,1,2);
        Rezervare rezervare2 =new Rezervare(2,2,6);
        Rezervare rezervare3 =new Rezervare(3,6,4);
        Rezervare rezervare4 = new Rezervare(1,6,4);

        ClientFactory factory = new ClientFactory();


    }
}
