package restaurant.decorator;

public abstract class NotaDePlataPersonalizata implements Printabil {

    private Printabil notaDePlata;

    public NotaDePlataPersonalizata( Printabil notaDePlata){
        this.notaDePlata=notaDePlata;
    }

    public void printare(){ notaDePlata.printare();}

    public abstract void printareMesajPersonalizat();
}
