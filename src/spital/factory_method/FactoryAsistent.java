package spital.factory_method;

public class FactoryAsistent implements AbstractFactory{
    @Override
    public PersonalSpital createType() {
        return new Asistent();
    }
}
