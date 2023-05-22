package restaurant.facade;

import java.util.ArrayList;
import java.util.List;

public class Mese {


    private List<Integer> mese;

    public Mese() {
        mese = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mese.add(i + 1);
        }
    }

    public boolean verificaMasaLibera(int codMasa){return mese.contains(codMasa);}
}
