package restaurant.factory.factorymethod;

public class FactorySupaLegume implements Factory{
    @Override
    public Supa createObject() {
        return new SupaLegume();
    }
}
