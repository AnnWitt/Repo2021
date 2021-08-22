package z20210822.varargs;
/*

public class Silnik {
    private int moc;

    private Silnik(){ //prywatny konstruktor
    }

    public static  final class SilnikBuilder { //publiczna klasa bo konsturktor prywatny. Tworzymy druga klase i kopioujemy
        // wszyatkie pola
        private int moc;

        public SilnikBuilder withMoc(int moc) { //tworzym metoda aby zwracala kklase buildera
            this.moc=moc;
            return this;
        }

     public Silnik build() {
            Silnik silnik=new Silnik();
            silnik.moc=this.moc;
            return silnik;
     }

    }
}
*/

public class Silnik {
    private int moc;
    private String pojemnosc;
    private String model;
    private TypSilnikaEn typSilnika; //ma byc enumem - skoryguj
    private String kolor;


    private Silnik() {
    }

    public static SilnikBuilder builder() {
        return new SilnikBuilder();
    }

    //gettery musza byc w obrebie silnika a nie w silnik builderze


    public static final class SilnikBuilder {
        private int moc;
        private String pojemnosc;
        private String model;
        private TypSilnikaEn typSilnika;
        private String kolor;

        public SilnikBuilder withMoc(int moc) {
            this.moc = moc;
            return this;
        }

        public SilnikBuilder withPojemnosc(String pojemnosc) {
            this.pojemnosc = pojemnosc;
            return this;
        }

        public SilnikBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public SilnikBuilder withTypSilnika(TypSilnikaEn typSilnika) {
            this.typSilnika = typSilnika;
            return this;
        }

        public SilnikBuilder withKolor(String kolor) {
            this.kolor = kolor;
            return this;
        }

        public Silnik build() {
            Silnik silnik = new Silnik();
            silnik.moc = this.moc;
            silnik.pojemnosc = this.pojemnosc;
            silnik.kolor = this.kolor;
            silnik.model = this.model;
            silnik.typSilnika = this.typSilnika;
            return silnik;
        }
    }

    //---filtrowanie



    //------------gettery
    public String getPojemnosc() {
        return pojemnosc;
    }

    public String getModel() {
        return model;
    }

    public TypSilnikaEn getTypSilnika() {
        return typSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public int getMoc() {
        return moc;
    }
}