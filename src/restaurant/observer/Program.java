package restaurant.observer;

public class Program {

    public static void main(String[] args) {
        Observer smsObserver = new SmsObserver("0722222");
        Observer emailObserver = new EmailObserver("observer@yahoo.com");

        Restaurant restaurant = new Restaurant("Nume Restaurant");
        restaurant.adaugaObserver(smsObserver);
        restaurant.adaugaObserver(emailObserver);

        restaurant.notificareOfertaNoua();
    }
}
