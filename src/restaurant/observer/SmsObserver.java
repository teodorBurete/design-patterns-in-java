package restaurant.observer;

public class SmsObserver implements Observer {

    String nrTelefon;

    public SmsObserver(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Ai primit pe numarul "+this.nrTelefon+" mesajul: "+mesaj);
    }
}
