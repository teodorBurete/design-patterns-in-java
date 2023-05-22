package restaurant.composite;

public class Item implements ComponentaMeniu {

    private String denumire;
   private double pret;

    public Item(String denumire,double pret){
        this.denumire=denumire;
        this.pret=pret;
    }
    @Override
    public void descriere() {
        System.out.println("Denumire: "+this.denumire+", Pret: "+this.pret);
    }
}
