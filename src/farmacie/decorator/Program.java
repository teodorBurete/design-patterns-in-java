package farmacie.decorator;

public class Program {

    public static void main(String[] args) {
        IBon bonLaMultiAni = new BonLaMultiAni(new BonDeCasa("12",10.0));

        IBon bonNormal = new BonDeCasa("10",11.);
        bonNormal.printare();
        System.out.println();
        bonLaMultiAni.printare();
    }
}
