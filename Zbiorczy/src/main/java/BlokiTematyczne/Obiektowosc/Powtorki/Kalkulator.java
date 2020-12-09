package BlokiTematyczne.Obiektowosc.Powtorki;

public class Kalkulator {
    //nie ma zadnych danych, te metody powinny byc statyczne, nie ma zadnych danych w pamieci dlatego dodajemy

    public static int dodaj(int i, int j) {
        return i+j;
    }

    public static int odejmij(int i, int j) {
        return i-j;
    }

    public static int pomnoz(int i, int j) {
        return i*j;
    }

    public static int podziel(int i, int j) {

        return i/j;
    }

    private int liczba; //- nie mozemy sie odwolac this.liczba bo jest zwiazana z konkretnym obiektem
    private static int liczba2; //

}
//pole statyczne wspolne dla wszystkich obiektow klasy
//metoda statyczna nie moze odwolyac sie do pol klasy, nie jest zwiazana z zadnym obiektem

