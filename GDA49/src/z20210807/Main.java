package z20210807; //zmien nazwe pakietu na date

public class Main {
    protected int zmienna=1; //widoczne jedynie w ramach tego pakietu. Aby bylo miedzy pakietami to public.
    protected static String imie="Ania";

    public static void main(String[] args) {
       // Car car=new Car();
        //car.wiek;

        final int finalVariable=4 ; //niemodyfikowalna. Proba zmiany = błąd kompilacji



        //imie="Ania2";
	//System.out.println("Witaj świecie " + imie);

	int wiek=20;
    if (czyMozePic(wiek)) {
        System.out.println("Jesteś uprawniony do picia alkoholu");
    } else {
        System.out.println("Nie jesteś uprawniony do picia alkoholu ");
    }

   // int x=3.2; -> błąd, musi być double lub float
        //System.out.println(x);
    procesZapisu(); //wywolanie (void - nic nie zwraca, tylko wyswietla ale skorzystac nie mozna)


        //logiczne

        System.out.println("boolean test");
        boolean myLog1=false;
        boolean myLog2=true;
        boolean myBoolean=myLog1 && myLog2 ; // true jeżeli obie będą true

        char znakNwejlini='\n';

        if (myBoolean) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("x" + znakNwejlini + "y");

        char kropka='.';
        System.out.println(kropka);

        char nieznanyZnak='\r';
        System.out.println("teskt" + nieznanyZnak + "tdd");


    }


   private static void procesZapisu(){
       System.out.println("Zapis do bazy danych"); //np wywolanie metody z serwisu

    }

    //main statis, metody statyczne, zmienne statyczne
    private static boolean czyMozePic(int wiek) {
        return wiek>18; // if (czyMozePic(20)) { - sprawdzenie dla tej 20
    }
}


