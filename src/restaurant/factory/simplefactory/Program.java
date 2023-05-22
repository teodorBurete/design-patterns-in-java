package restaurant.factory.simplefactory;

public class Program {

    public static void main(String[] args) throws Exception {

        SupaFactory supaFactory = new SupaFactory();
        Supa supa1 = supaFactory.createInstance(TipSupa.supaLegume);
        supa1.descriere();

        supa1 = supaFactory.createInstance(TipSupa.supaVita);
        supa1.descriere();
    }
}
