package farmacie.strategy;

public class Client {

    String name;
    ModPlata modPlata;

    public Client(String name) {
        this.name = name;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double suma){
        modPlata.plateste(this.name,suma);
    }
}
