package farmacie.Facade;

public class Facade {

    private Reteta reteta = new Reteta("Medicamentul 1, Medicamentul 2");
    private CardSanatate cardSanatate = new CardSanatate(1294);

    public void proceduraVanzareMedicamente(Depozit depozit){
        reteta.verificareReteta();
        cardSanatate.setValid(true);
        cardSanatate.verificareCard();
        depozit.verificareStoc(reteta);
    }
}
