package restaurant.factory.factorymethod;

public class FactorySupaVita implements Factory{
    @Override
    public Supa createObject() {
        return new SupaVita();
    }
}
