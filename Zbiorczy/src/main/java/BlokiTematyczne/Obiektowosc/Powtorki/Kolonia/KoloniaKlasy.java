package BlokiTematyczne.Obiektowosc.Powtorki.Kolonia;

public class KoloniaKlasy {

    String kolorWlosow;
    int wiek;
    String kolorOczu;
    int wzrost;
    int costam = 999;
    //static String ZeStatic="dupa ale statyczna";
    static String ZeStatic; //zwroci nulla ale spoko

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

    public static boolean lataWalidacja(int lata) {
        if (lata>0) {
            return true;
        } else {
            return false;
        }
    }


public static int dupa(int n) {
        int result=n;
        while (n>0){
            result*=n;
            n--;
        }
        return result;
}

    public static int dupa2(int n) {
        int result2=n;
        while (--n>0){
           result2*=n;
        }
        return result2;
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
    public int getCostam() {
        return costam;
    }

    public void setCostam(int costam) {
        this.costam = costam;
    }
}
