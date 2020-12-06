package BlokiTematyczne.Obiektowosc.Powtorki.Kolonia;

public class KoloniaKlasy {

    String kolorWlosow;
    int wiek;
    String kolorOczu;
    int wzrost;

    public KoloniaKlasy() {
    }

    public KoloniaKlasy(String kolorWlosow, int wiek, String kolorOczu, int wzrost) {
        this.kolorWlosow = kolorWlosow;
        this.wiek = wiek;
        this.kolorOczu = kolorOczu;
        this.wzrost = wzrost;
    }

    public static int RokUrodzenia(int wiek) { //gry był private metoda nie była możliwa do użycia w klasie
        int rok=2020-wiek;
        return rok;
    }

    public int WiekPrzyszly (int lata) {
        return getWiek()+lata;
    }

    public int WiekMinus (int WiekPrzyszly) {
        //int x=this.wiek;
        //int x=RokUrodzenia(this.wiek)+WiekPrzyszly;
        int x=RokUrodzenia(getWiek())+WiekPrzyszly; //wyjdzie to samo co powyzej
        return x;
    }







    //Gettery Settery
    public String getKolorWlosow() {
        return kolorWlosow;
    }

    public void setKolorWlosow(String kolorWlosow) {
        this.kolorWlosow = kolorWlosow;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getKolorOczu() {
        return kolorOczu;
    }

    public void setKolorOczu(String kolorOczu) {
        this.kolorOczu = kolorOczu;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }
}
