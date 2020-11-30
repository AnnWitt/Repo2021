package BlokiTematyczne.Obiektowosc.KopiaSamPrez;

import java.util.Objects;

public class SamochodKonstr {
    public String marka;
    //pola

    //private String marka; --> byl problem, musialam zmienic na public albo w ogole usunąć
     String kolor;
     int rocznik;
     private int liczbaDrzwi;

    //konstruktor nosi taka sama nazwe jak klasa. ma tworzony konsturktor domyslny. Konstruktor nic nie zwraca. To co zwraca to metoda

    public SamochodKonstr() { //konsturktor bezparametrowy, czy musi byc
        System.out.print("Jakis tam tekst z pustego konstruktora po którym rzuca smieci "); //>> wez zapytaj
    }

    public SamochodKonstr(String dupa) {
        this.marka = dupa;
    }

    //NIE USUWAJ TEGO - TO PO TO ABYS PAMIETALA
/*    public SamochodKonstr(String dupa2) {
        this.marka = dupa2;
    } bedzie sie czepial bo juz ma konsturktor po jednym stringu i guzik go obchodzi ze to inna nazwa*/

    public SamochodKonstr(int rocznik) {
        this.rocznik = rocznik;
    }

    public SamochodKonstr(String marka, String kolor) {
        this.marka = marka+"bla bla marka";
        this.kolor = kolor + "bla bla kolor";

    }

    public SamochodKonstr(String dupa, String dupa2, String dupa3) {
        this.kolor=dupa;
        this.marka=dupa2;
        dupa2=dupa3;
    }

    public static int Ilelat (int rocznik) { //metoda z klasy SamochodKonstr do wywolania
       int wiek=2020-rocznik;
       return wiek;
    } //SamochodKonstr.Ilelat(2010)

    //gettery i settery


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public int getLiczbaDrzwi() {
        //liczbaDrzwi=3;
        return liczbaDrzwi;
    }

//    public void setLiczbaDrzwi(int liczbaDrzwi) {
//        this.liczbaDrzwi = liczbaDrzwi;
//    }

    public int setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
        return liczbaDrzwi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SamochodKonstr that = (SamochodKonstr) o;
        return rocznik == that.rocznik &&
                liczbaDrzwi == that.liczbaDrzwi &&
                Objects.equals(marka, that.marka) &&
                Objects.equals(kolor, that.kolor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, kolor, rocznik, liczbaDrzwi);
    }
}
