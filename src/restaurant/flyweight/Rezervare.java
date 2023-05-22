package restaurant.flyweight;

import java.time.LocalDateTime;

public class Rezervare {

    private long idClient;
    private int numarPersoane;
    private LocalDateTime dateTime = LocalDateTime.now();
    private int numarMasa;

    public Rezervare(long idClient,int numarMasa, int numarPersoane){
        this.idClient=idClient;
        this.numarMasa=numarMasa;
        this.numarPersoane=numarPersoane;
    }
}
