package BlokiTematyczne.Obiektowosc.Obiektowosc_zdn;

public class PracownikKonstr {
    //Zadanie 1//
/*    2.
    Do klasy dodaj następujące pola: imię , nazwisko , wiek , dataZatrudnienia ,
    wynagrodzenie .*/


    /*    Zadania ostatnie: Dodać pole statyczne do klasy Pracownik oraz jeszcze jedną linijkę kodu
    która spowoduje że zmienna statyczna będzie zliczać ilość stworzonych obiektów tej klasy.
    */

    int zliczenieObiektow;
    int ID_Pracownika=1;
    int IloscPracownikow=1;
    String imie;
    String nazwisko;
    int wiek;
    String dataZatrudnienia;
    int wynagrodzenie;

    public static int licznik; //nie dajemy do kontruktora, tylko zwiekszyc o 1
    //aby kazdy pravcownik dostawal unikatowe ID




/*    Utwórz trzy konstruktory , które przyjmują: imię , imię i nazwisko , wszystkie
            pola*/

    public PracownikKonstr(String imie) {
        this.imie = imie;

    }

    public PracownikKonstr(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    public PracownikKonstr(String imie, String nazwisko, int wiek, String dataZatrudnienia, int wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.dataZatrudnienia = dataZatrudnienia;
        this.wynagrodzenie = wynagrodzenie;
        //ID_Pracownika=ID_Pracownika+1;
    }

/*    Utwórz metody get i set , a także metody o nazwie pracuje , odpoczywa , które
    nic nie zwracają.*/

    public static void pracuje () {

    }
    public static void odpoczywa () {

    }

    public String getImie() {
        return imie;
    }

    public String setImie(String imie) {
        this.imie = imie;
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int setWiek(int wiek) {
        this.wiek = wiek;
        return wiek;
    }

    public String getDataZatrudnienia() {
        return dataZatrudnienia;

    }

    public String setDataZatrudnienia(String dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
        return dataZatrudnienia;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public int setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
        return wynagrodzenie;
    }

    //przedtswienie, przyjmuje imie i jakies zdanie wypluwa

    public void Powitanie() {
        //String pow="Witaj" + getImie();
        //System.out.println("cokolwiek" + getImie());
        System.out.println("cokolwiek" + this.imie);
    }

/*    Zadania ostatnie: Dodać pole statyczne do klasy Pracownik oraz jeszcze jedną linijkę kodu
    która spowoduje
    że zmienna statyczna będzie zliczać ilość stworzonych obiektów tej klasy.
    */

/*    public int getID_Pracownika() {
        return ID_Pracownika;
    }*/

    public int setID_Pracownika(int ID_Pracownika) {
        //his.ID_Pracownika = ID_Pracownika+1; alternatywa ponizej
        this.ID_Pracownika+=ID_Pracownika;
        ID_Pracownika++;
        return ID_Pracownika;
    }

    public int setIloscPracownikow(int iloscPracownikow) {
        IloscPracownikow = iloscPracownikow+1;
        return iloscPracownikow;
    }
}
