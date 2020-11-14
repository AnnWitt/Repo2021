package BlokiTematyczne.tablice;

public class Tablice {
    public static void main(String[] args) {
        //String[] pasazerowie; ->> tablica stringow
        String[] pasazerowie;
        pasazerowie=new String[4]; //4 wielkosc tablicy typu string, poki co sa nulami, mozna w jednym wierszu z deklaracja
        int[] xxx=new int[10];
        pasazerowie[0]="JAn"; //[rzypisanie do komórki zero
        String rom="roman";
        pasazerowie[3]=rom;
        System.out.println(pasazerowie[0]); //wyrzucenie elementu
        String drugiPasazer=pasazerowie[1]; //-->null w przypadku stringu
        //sprawdzenie ile elementow w tablicy
        System.out.println(pasazerowie.length);
        System.out.println(xxx.length);
        //tworzenie tablicy i od razu wpisania elemntow
        String[] pas2=new String[]{"Jan","Anna"}; //nie podano lwielkosci tabeli
        String[] pas21=new String[]{"Jan",rom};

        System.out.println("proba wypisania for each");

        for (String str: pas21) {
            System.out.println(str + " ");
        }

    }
}

