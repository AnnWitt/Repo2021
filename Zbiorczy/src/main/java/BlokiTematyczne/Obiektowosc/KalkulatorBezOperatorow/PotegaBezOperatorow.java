package BlokiTematyczne.Obiektowosc.KalkulatorBezOperatorow;

public class PotegaBezOperatorow {
    public static void main(String[] args) {
//3 ^ 5 =243 //2 ^ 5 = 32
        int potega = 7;
        potega--;

        int licznikPotegi = potega; //3

        int podstawa = 3, mnoznik = podstawa;
        int licznik; //= podstawa;
        int backupMnoznika = podstawa;
        int backupLicznika = podstawa;

        while (licznikPotegi > 0) {
            //dzialajace mnozenie
            while (mnoznik > 1) {
                licznik = backupLicznika;
                while (licznik > 0) {
                    podstawa++;
                    licznik--;
                }
                mnoznik--;
            }
            //----
            //podstawa wynosi wynik mnozenia
            backupLicznika = podstawa;
            mnoznik = backupMnoznika;
            licznikPotegi--;
        }

        // tu wychodzi podstawa ktora bedziemy dalej domnazac przez mnoznik
        //mnozenie

        //na tym etapie podstawa jest wynikiem podstawy domnozonej o domnazanie (tj pierwsza podstawe)

        int wynik = podstawa;
        System.out.println(wynik);

    }
}



