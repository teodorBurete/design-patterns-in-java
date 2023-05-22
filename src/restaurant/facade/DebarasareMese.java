package restaurant.facade;

import java.util.ArrayList;
import java.util.List;

public class DebarasareMese {

    private List<Boolean> meseCurate;

    public DebarasareMese(){

        meseCurate = new ArrayList<>();

        for(int i = 0 ;i<5;i++){
            meseCurate.add(true);
        }

        for(int i = 5;i<10;i++){
            meseCurate.add(false);
        }
    }

    public boolean esteMasaCurata(int codMasa){
        return meseCurate.get(codMasa);
    }


    public boolean areServeteleNoi(int codMasa){
        return meseCurate.get(codMasa);
    }
}
