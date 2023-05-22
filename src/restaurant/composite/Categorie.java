package restaurant.composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements ComponentaMeniu {

    private String denumire;
    private List<ComponentaMeniu> leafs;

    public Categorie(String denumire) {
        this.denumire = denumire;
        this.leafs = new ArrayList<>();
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: "+denumire);
        leafs.forEach(ComponentaMeniu::descriere);
    }

    public void adaugare(ComponentaMeniu componentaMeniu){
        leafs.add(componentaMeniu);
    }

    public void stergere(ComponentaMeniu componentaMeniu){
        leafs.remove(componentaMeniu);
    }
}
