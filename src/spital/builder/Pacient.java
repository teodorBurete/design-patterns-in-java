package spital.builder;

public class Pacient {

    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    private Pacient(){
        patRabatabil=false;
        micDejun=false;
        papuciCamera=false;
        halatInterior=false;
    }

    public static class PacientBuilder implements AbstractBuilder{

        private Pacient pacient;

        public PacientBuilder(){
            pacient=new Pacient();
        }

        public PacientBuilder setPatRabatabil(){
            pacient.patRabatabil=true;
            return this;
        }
        public PacientBuilder setMicDejun(){
            pacient.micDejun=true;
            return this;
        }

        public PacientBuilder setPapuciCamera(){
            pacient.papuciCamera=true;
            return this;
        }

        public PacientBuilder setHalatInterior(){
            pacient.halatInterior=true;
            return this;
        }
        @Override
        public Pacient build() {
            return this.pacient;
        }
    }
}
