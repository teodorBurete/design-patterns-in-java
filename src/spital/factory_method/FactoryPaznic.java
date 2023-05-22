package spital.factory_method;

public class FactoryPaznic implements AbstractFactory{
    @Override
    public PersonalSpital createType() {
        return new Paznic();
    }
}
