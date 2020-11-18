package BlokiTematyczne.Obiektowosc.KalkulatorBezOperatorow;

public class DzielenieBezOperatorow {

    public static void main(String[] args) {

        int dzielna=14, dzielnik=2;
        int doDzielnika=dzielnik;
        int licznik=0;

        while (dzielna>0) {
            dzielnik=doDzielnika;
            while (dzielnik > 0) {
                dzielna--;
                dzielnik--;
            }
        licznik++;
        }

        int wynik = licznik;

        System.out.println(wynik);




    }

}
