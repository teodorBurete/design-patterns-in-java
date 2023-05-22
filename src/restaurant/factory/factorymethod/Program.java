package restaurant.factory.factorymethod;

public class Program {

    public static void afisare (Factory factory){
        factory.createObject().descriere();
    }
    public static void main(String[] args) {

        afisare(new FactorySupaLegume());

    }
}
