package farmacie.decorator;

public class BonLaMultiAni extends BonDecorator{
    public BonLaMultiAni(IBon bonDecorat) {
        super(bonDecorat);
    }

    @Override
    public void printare() {
        bonDecorat.printare();
        printareLaMultiAni();
    }

    private void printareLaMultiAni(){
        System.out.println("La Multi Ani!");
    }
}
