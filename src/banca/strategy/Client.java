package banca.strategy;

public class Client {

    private String nume;
    private TipClient tipClient;

    public Client(String nume, TipClient tipClient) {
        this.nume = nume;
        this.tipClient = tipClient;
    }

    public void solicitaActe() {
        tipClient.solicitaActe(this.nume);
    }
}
