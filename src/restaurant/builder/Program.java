package restaurant.builder;

public class Program {

    public static void main(String[] args) {

        Rezervare rezervare = new Rezervare.RezervareBuilder().setMuzicaAmbientala().setMasaDecorata().build();
    }
}
