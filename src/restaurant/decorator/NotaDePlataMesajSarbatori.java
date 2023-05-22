package restaurant.decorator;

public class NotaDePlataMesajSarbatori extends NotaDePlataPersonalizata{
    public NotaDePlataMesajSarbatori(Printabil notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printareMesajPersonalizat() {
        System.out.println("La multi ani!");

    }
}
