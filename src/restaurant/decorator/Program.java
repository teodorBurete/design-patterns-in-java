package restaurant.decorator;

public class Program {

    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata();
        notaDePlata.printare();

        System.out.println("-------------");
        NotaDePlataPersonalizata notaDePlataPersonalizata = new NotaDePlataMesajSarbatori(notaDePlata);
        notaDePlataPersonalizata.printare();
        notaDePlataPersonalizata.printareMesajPersonalizat();
    }
}
