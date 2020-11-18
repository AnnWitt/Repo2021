package BlokiTematyczne.Obiektowosc.KalkulatorBezOperatorow;

public class PotegaBezOperatorow {
    public static void main(String[] args) {
//3 ^ 5 =243 //2 ^ 5 = 32
        int potega = 5;
        int wartoscWdolPotegi=potega;

        //potrzebne do mnozenia
        int podstawa = 2, mnoznik;// = podstawa;
        int wartoscWdolMnozenie;
        int cykl = podstawa;
        //koniec do mnozenia


        //a wez to sprobuj z wywolaniem z tego mnozenia//


while (wartoscWdolPotegi>0) {
    mnoznik = cykl;
    //dzialajace mnozenie
    while (mnoznik > 1) {
        wartoscWdolMnozenie = cykl;
        while (wartoscWdolMnozenie > 0) {
            podstawa++;
            wartoscWdolMnozenie--;
        }
        mnoznik--;
    }
    //3 a podstawa 9
    wartoscWdolPotegi--;
}


        // tu wychodzi podstawa ktora bedziemy dalej domnazac przez mnoznik
        //mnozenie

        //na tym etapie podstawa jest wynikiem podstawy domnozonej o domnazanie (tj pierwsza podstawe)

        int wynik = podstawa;
        System.out.println(wynik);

    }
}


//zapas: dziala tylko dla 2
/*
public class PotegaBezOperatorow {
    //działa tylko dla dwójki
    public static void main(String[] args) {

        int potega = 5;

        int podstawa = 2, domnazanie; //mnoznik będzie nasza druga liczba prze zktora domnazany potega razy
        int cyklDomnazanie=podstawa;
        int doPodstawy;

        for (int i=1;i<potega;i++) {
            domnazanie = cyklDomnazanie;
            //mnozenie
            while (domnazanie > 1) {
                doPodstawy = podstawa;
                while (doPodstawy > 0) {
                    podstawa++;
                    doPodstawy--;
                }
                domnazanie--;
            }
            //mnozenie

        }

        //na tym etapie podstawa jest wynikiem podstawy domnozonej o domnazanie (tj pierwsza podstawe)

        int wynik = podstawa;
        System.out.println(wynik);

    }
}*/
