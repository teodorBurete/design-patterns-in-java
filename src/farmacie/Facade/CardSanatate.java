package farmacie.Facade;

public class CardSanatate {

    private long id;
    private boolean isValid;

    public CardSanatate(long id){
        this.id = id;
    }

    public void setValid(boolean bool){
        isValid=bool;
    }

    public void verificareCard(){
        if(isValid)
            System.out.println("Cardul de sanatate cu ID "+id+" este valid!");
        else{
            System.out.println("Cardul de sanatate cu ID "+id+" NU este valid!");
        }
    }

}
