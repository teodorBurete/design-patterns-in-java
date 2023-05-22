package restaurant.observer;

import java.util.ArrayList;

public class Restaurant implements Subject {

    private String numeRestaurant;
    private ArrayList<Observer> observers;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.observers = new ArrayList<>();
    }


    @Override
    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Observer observer : observers) {
            observer.receptionareMesaj(numeRestaurant+": "+ mesaj);
        }
    }

    public void notificareOfertaNoua(){
        trimiteMesaj("A fost adaugata o noua oferta. Consultati noul nostru catalog!");
    }

    public void notificareReducerePret(){
        trimiteMesaj("Preturile au fost reduse. Consultati noul nostru catalog!");
    }
}
