package restaurant.decorator;

public class NotaDePlata implements Printabil{

    @Override
    public void printare() {
        System.out.println("Aceasta este nota dumneavoastra de plata!");
    }
}
