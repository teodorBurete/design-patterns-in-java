package farmacie.composite;

public class Item implements IComponenta{

    String name;

    public Item(String name){
        this.name=name;
    }
    @Override
    public void descriere() {
        System.out.println("Acest item se numeste: "+this.name);
    }
}
