package farmacie.Facade;

public class Program {

    public static void main(String[] args) {
        Facade facade = new Facade();

        Depozit depozit = new Depozit();
        facade.proceduraVanzareMedicamente(depozit);
    }
}
