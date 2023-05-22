package farmacie.decorator;

public abstract class BonDecorator implements IBon {

    protected IBon bonDecorat;

    public BonDecorator(IBon bonDecorat){
        this.bonDecorat=bonDecorat;
    }

    @Override
    public void printare() {
        bonDecorat.printare();
    }
}
