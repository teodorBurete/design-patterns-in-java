package restaurant.state;

public class StareRezervata implements IStare{
    @Override
    public void doAction(Masa masa) {

        System.out.println("Masa cu numarul "+masa.numarMasa+" este acum rezervata");
        masa.setStare(this);

    }
}
