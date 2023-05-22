package spital.simple_factory;

public class Factory {

    public PersonalSpital createPersonal(TipPersonal tipPersonal){
        if (tipPersonal==TipPersonal.medic)
            return new Medic();
        else if(tipPersonal == TipPersonal.paznic)
            return new Paznic();
        else if(tipPersonal == TipPersonal.asistent)
            return new Asistent();

        return null;
    }
}
