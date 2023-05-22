package restaurant.observer;

public class EmailObserver implements Observer{

    String adresaEmail;

    public EmailObserver(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Ai primit pe adresa de Email: "+this.adresaEmail+" mesajul: "+mesaj);

    }
}
