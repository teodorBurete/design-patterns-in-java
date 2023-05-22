package farmacie.Facade;

public class Depozit  {

    public Depozit(){

    }

    public void verificareStoc(Reteta reteta){
        String medicamente = reteta.getMedicamente();
        System.out.println("Au fost verificare urmatoarele medicamente in stoc: "+medicamente);
    }
}
