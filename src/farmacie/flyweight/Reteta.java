package farmacie.flyweight;

public class Reteta {

    long nrReteta;
    double sumaPlata;
    int nrMedicamente;

    public Reteta(long nrReteta, double sumaPlata, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.sumaPlata = sumaPlata;
        this.nrMedicamente = nrMedicamente;
    }

    public long getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(long nrReteta) {
        this.nrReteta = nrReteta;
    }

    public double getSumaPlata() {
        return sumaPlata;
    }

    public void setSumaPlata(double sumaPlata) {
        this.sumaPlata = sumaPlata;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }
}
