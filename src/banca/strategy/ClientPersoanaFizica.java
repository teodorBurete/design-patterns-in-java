package banca.strategy;

public class ClientPersoanaFizica implements TipClient{
    @Override
    public void solicitaActe(String nume) {
        System.out.println("Buna ziua, "+nume+". Aveti nevoie de buletinul și adeverință de la munca.");
    }
}
