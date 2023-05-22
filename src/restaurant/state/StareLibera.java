package restaurant.state;

public class StareLibera implements IStare{
    @Override
    public void doAction(Masa masa) {
        System.out.println("Masa cu numarul "+masa.numarMasa+" este acum libera");
        masa.setStare(this);
    }
}
