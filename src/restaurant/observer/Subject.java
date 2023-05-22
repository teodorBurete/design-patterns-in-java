package restaurant.observer;

public interface Subject {

    void adaugaObserver(Observer observer);

    void stergeObserver(Observer observer);

    void trimiteMesaj(String mesaj);
}
