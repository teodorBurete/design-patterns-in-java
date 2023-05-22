package spital.factory_method;

public class Medic implements PersonalSpital {
    @Override
    public void descriere() {
        System.out.println("Sunt un medic!");
    }
}
