package spital.factory_method;

public class FactoryMedic implements AbstractFactory{
    @Override
    public PersonalSpital createType() {
        return new Medic();
    }
}
