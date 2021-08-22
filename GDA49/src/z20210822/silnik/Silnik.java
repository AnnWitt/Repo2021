package z20210822.silnik;
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

    private Silnik() {

    }

    public static SilnikBuilder builder() {
        return new SilnikBuilder();
    }


    //gettery musza byc w obrebie silnika a nie w silnik builderze
    public int getMoc() {
        return moc;
    }

    public String getPojemnosc() {
        return pojemnosc;
    }



    public static final class SilnikBuilder {
        private int moc;
        private String pojemnosc;

        public SilnikBuilder withMoc(int moc) {
            this.moc = moc;
            return this;
        }

        public SilnikBuilder withPojemnosc(String pojemnosc) {
            this.pojemnosc=pojemnosc;
            return this;
        }



        public Silnik build() {
            Silnik silnik = new Silnik();
            silnik.moc = this.moc;
            silnik.pojemnosc=this.pojemnosc;
            return silnik;
        }
    }
}