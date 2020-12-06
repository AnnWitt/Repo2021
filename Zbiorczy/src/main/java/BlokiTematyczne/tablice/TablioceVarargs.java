package BlokiTematyczne.tablice;

public class TablioceVarargs {

    public static void main(String[] args) {

        //przyklad bez tablicy
        System.out.println(var(3, 5, 6, 8, 0, 2));


        System.out.println("tablica z var args");
        int[] tbl = vartbl(1, 5, 8, 2); //definiowanie tablicy za pomoca  metody
        System.out.println(tbl[2]); //powinno wyjsc 8

    }

    static int var(int... n) { //do wyswietlenia w sout ew wykorzystanie dalej
        int suma = 0;
        for (int i = 0; i < n.length; i++) {
            //System.out.println(n[i]);
            suma = suma + n[i];
        }
        return suma;
    }

    static int[] vartbl(int... n) { // do wyciagniecia tablicy i ew uzycia dalej
        int[] wynik = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            wynik[i] = n[i];
        }
        return wynik;
    }


    //koniec klasy
}