package restaurant.factory.simplefactory;

public class SupaFactory {

    public Supa createInstance(TipSupa tipSupa) throws Exception {

        switch (tipSupa) {
            case supaVita:
                return new SupaVita();
            case supaLegume:
                return new SupaLegume();
            case supaCiuperci:
                return new SupaCiuperci();
            default:
                throw new Exception("Tipul de supa nu exista!");
        }
    }
}
