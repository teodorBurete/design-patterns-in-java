package farmacie.flyweight;

public class Client implements IClientFlyweight {

    private String nume;
    private long nrAsigurare;

    public Client(String nume, long nrAsigurare){
        this.nume=nume;
        this.nrAsigurare=nrAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public long getNrAsigurare() {
        return nrAsigurare;
    }

    @Override
    public void printare(Reteta reteta) {
        System.out.println("Clientul: "+nume+", Nr. Asigurare: "+nrAsigurare+" achizitioneaza reteta cu nr: "
                +reteta.nrReteta+", numar medicamente: "+reteta.nrMedicamente+", pret total: "+reteta.sumaPlata);
    }
}
