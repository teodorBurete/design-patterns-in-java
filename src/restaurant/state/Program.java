package restaurant.state;

public class Program {

    public static void main(String[] args) {

        IStare stareLibera = new StareLibera();
        IStare stareOcupata = new StareOcupata();

        Masa masa1 = new Masa(1);

        stareOcupata.doAction(masa1);
        stareLibera.doAction(masa1);


    }
}
