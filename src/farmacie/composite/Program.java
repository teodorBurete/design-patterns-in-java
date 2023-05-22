package farmacie.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {


    public static void main(String[] args) {

        ArrayList<IComponenta> categoriiPrincipale = new ArrayList<>();

        Categorie categorieRaceala = new Categorie("Raceala");
        Categorie categorieDurere = new Categorie("Durere");
        Categorie categorieAntibiotice = new Categorie("Antibiotice");

        Categorie subsectiuneAntibioticAdulti = new Categorie("Antibiotice Adulti");
        Categorie subsectiuneAntibioticCopii = new Categorie("Antibiotice Copii");
        Categorie subsectiuneIbuprofen = new Categorie("Ibuprofen");
        Categorie subsectiuneOpioide = new Categorie("Opioide");
        Item nurofen = new Item("Nurofen");
        Item morfina = new Item("Morfina");

        categorieDurere.adaugare(subsectiuneIbuprofen);
        categorieDurere.adaugare(subsectiuneOpioide);
        subsectiuneIbuprofen.adaugare(nurofen);
        subsectiuneOpioide.adaugare(morfina);

        categorieAntibiotice.adaugare(subsectiuneAntibioticAdulti);
        categorieAntibiotice.adaugare(subsectiuneAntibioticCopii);

        categoriiPrincipale.addAll(Arrays.asList(categorieRaceala,categorieDurere,categorieAntibiotice));

        categoriiPrincipale.forEach(IComponenta::descriere);
    }

}
