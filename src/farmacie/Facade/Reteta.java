package farmacie.Facade;

public class Reteta {

    private String medicamente;

    public Reteta(String medicamente){
        this.medicamente = medicamente;
    }

    public String getMedicamente() {
        return medicamente;
    }

    public void verificareReteta(){
        System.out.println("Reteta a fost verificata");
    }
}
