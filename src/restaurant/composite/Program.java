package restaurant.composite;

public class Program {

    public static void main(String[] args) {

        Categorie sectiuneStartere = new Categorie("Startere");
        Categorie sectiuneBauturi = new Categorie("Bauturi");

        Categorie subsectiuneSucuri = new Categorie("Sucuri");
        Categorie subsectiuneCafea = new Categorie("Cafea");

        ComponentaMeniu itemCola = new Item("Cola",10);
        ComponentaMeniu itemPepsi = new Item ("Pepsi, ma-ta-i sexy",69);

        ComponentaMeniu itemCafeaCuLapte = new Item("Cafea cu lapte",5);
        ComponentaMeniu itemCapucino = new Item("Capucino",7);

        subsectiuneCafea.adaugare(itemCapucino);
        subsectiuneCafea.adaugare(itemCafeaCuLapte);
        subsectiuneSucuri.adaugare(itemCola);
        subsectiuneSucuri.adaugare(itemPepsi);
        sectiuneBauturi.adaugare(subsectiuneCafea);
        sectiuneBauturi.adaugare(subsectiuneSucuri);

        sectiuneBauturi.descriere();
    }
}
