package restaurant.facade;

public class Facade {

    private DebarasareMese debarasareMese;
    private Mese mese;
    public Facade(){
        debarasareMese= new DebarasareMese();
        mese= new Mese();
    }

    public void verificaDisponibilitateMasa(int codMasa){

        if(mese.verificaMasaLibera(codMasa)){
            System.out.println("Masa este libera. Verificare Debarasare");

           if(debarasareMese.areServeteleNoi(codMasa)&&debarasareMese.esteMasaCurata(codMasa)){
                System.out.println("Masa este debarasata");
            }else{
               System.out.println("Masa nu este debarasata!");
           }

        }else{
            System.out.println("Masa nu este libera!");
        }
    }
}
