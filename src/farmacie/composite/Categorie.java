package farmacie.composite;

import java.util.ArrayList;

public class Categorie implements IComponenta {

    private String numeCategorie;
    private ArrayList<IComponenta> leaves = new ArrayList<>();

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: "+numeCategorie);
        leaves.forEach(IComponenta::descriere);
       // System.out.println();
    }

    public void adaugare(IComponenta componenta){
        leaves.add(componenta);
    }
}
