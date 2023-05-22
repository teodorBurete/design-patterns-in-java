package farmacie.adapter.adapter_obiecte;

public class Adaptor implements VanzareMedicament{

    private ManagerStoc managerStoc;
    private long id;

    public Adaptor(){
        managerStoc= new ManagerStoc();
    }
    @Override
    public void vanzareMedicament(long id) {

        this.id = id;
    }

    @Override
    public void verificareDisponibilitate(int cantitate) {
        managerStoc.verificaStocMedicament(id,cantitate);
    }
}
