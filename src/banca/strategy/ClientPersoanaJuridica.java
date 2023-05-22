package banca.strategy;

public class ClientPersoanaJuridica implements TipClient{
    @Override
    public void solicitaActe(String nume) {
        System.out.println("Buna ziua, "+nume+"Aveti nevoie de actele de înființare a firmei precum si dovada" +
                "înregistrării la Registrul comerțului");
    }
}
