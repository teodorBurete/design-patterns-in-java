package spital.factory_method;

public class Program {

    public static void main(String[] args) {
        afisare(new FactoryAsistent());
    }

    public static void afisare(AbstractFactory factory){
           PersonalSpital personalSpital= factory.createType();
           personalSpital.descriere();
    }
}
