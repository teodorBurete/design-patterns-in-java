package restaurant.builder;

public class Rezervare {

    private boolean laGeam;
    private boolean areScaunErgonomic;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    private Rezervare() {
        laGeam = false;
        areMasaDecorata = false;
        areScaunErgonomic = false;
        areMuzicaAmbientala = false;
        genMuzica = null;
    }

    public static class RezervareBuilder implements IRezervareBuilder {

        private Rezervare rezervare;

        public RezervareBuilder() {
            rezervare = new Rezervare();
        }

        public RezervareBuilder setMasaLaGeam() {
            rezervare.laGeam = true;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientala() {
            rezervare.areMuzicaAmbientala = true;
            return this;
        }

        public RezervareBuilder setMasaDecorata() {
            rezervare.areMasaDecorata = true;
            return this;
        }

        public RezervareBuilder setScaunErgonomic() {
            rezervare.areScaunErgonomic = true;
            return this;
        }

        public RezervareBuilder setGenMuzica(String genMuzica) {
            rezervare.genMuzica = genMuzica;
            return this;
        }


        @Override
        public Rezervare build() {
            return this.rezervare;
        }
    }
}
