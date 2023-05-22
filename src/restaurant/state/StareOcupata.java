package restaurant.state;

public class StareOcupata implements IStare{
    @Override
    public void doAction(Masa masa) {
        System.out.println("Masa cu numarul "+masa.numarMasa+" este acum ocupata");
        masa.setStare(this);
    }
}
