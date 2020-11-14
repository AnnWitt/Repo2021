import java.util.Scanner;

public class IfInstr {
    public static void main(String[] args) {

        //        if (waruneklogiczny) {
        //            //kod
        //        }

    }

}

class ZadanieIF {

    public static void main(String[] args) {
        System.out.print("czy 2>3 -> ");
        if (2 > 3) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.print("czy 4<5 -> ");
        if (4 < 5) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        //(2-2)==0

        System.out.print("czy (2-2)==0) -> ");
        if ((2-2)==0) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.print("true -> ");
        if (true) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.print("9%2 -> ");
        if (9%2==0) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.print("9%3 -> " );
        if (9%3==0) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }


        //elseif

        int wiek;

//        if (wiek<15) {
//            System.out.println("za mlody");
//        } else {
//            if (wiek<=18) {
//                System.out.println("wejsc z opiekunem");
//            } else {
//                System.out.println("mozesz bez opiekuna");
//            }
//        }

//        if (wiek<15) {
//            System.out.println("wiek <15");
//        } else if (wiek>15 && wiek<18) { //wejdzie tu jezeli pierwszy falszywy
//            System.out.println("wez opiekuna");
//            else {
//                System.out.println(">18");
//            } //dwa warunki else do sprawdzenia
//        }
//if ...else if ...else if ...else

//        if (wiek<15) { //wiek<= obejmuje też 15
//            System.out.println("wiek <15");
//        } else if (wiek>15 && wiek<18) { //wejdzie tu jezeli pierwszy falszywy
//            System.out.println("wez opiekuna");
//            else if (wiek>99) {
//                System.out.println("za duzy wiek");
//            }
//            else {
//                System.out.println(">18");
//            } //dwa warunki else do sprawdzenia
//        }





  // if (warunek1
        //if warunek2

        //if (warunek 1, warunek2) -- szybsze niz powyzej bo jedna operacja (ale roznice nieduze)
        //jezeli 1 warunek nieprawdziwy to nie sprawdza dalej
        // if (wiek>18 && waga++<150) - zwiekszenie w ramach warunku

    }

    //ctrl shift poruszanie wieszem w gore w dol w obrebie klasy
}

class ZadanieSwitch {
    public static void main(String[] args) {
//alternatywa dla wielokrotnie zagniezdzonych ifów (odpowiednik case)

        int zmienna=3;
        switch(zmienna) { //w przypadku stringa wpisujemy w cudzyslowiach np "xxx"
            case 1: //jezeli zmienna ma wartosc 1
                //wykonac akcje dla 1 przypadku
                System.out.println("case1");
                break; //przerwanie bloku kodu, koniec dzialania, bez tego pojdzie dalej
            case 2:
                //wykonac akcje dla 2, nie wejdzie co kolejnego jesli prawdziwa
                System.out.println("case2");
                break;
                //inne
            default:
                System.out.println("case default");
                //wykonanie gdy w poprzednie nie weszlismy
                break;
        }
 //od wersji 7 mozna uzywac w switchu stirnga, jezeli podkresli imie wejsc w podpowiedz
        String imie="xxx";
        switch (imie) {
            case "xxcx":
                System.out.println(imie);
                break;
            default:
                System.out.println("inny");
                break; //bez nich wyrzuci wszystkie mozliwe casy
        }

    }
}

class Zadanie10{
    public static void main(String[] args) {
        int a=30, b=15,c=7,max;
        System.out.println(a + " " + b + " " + c);
        if (a>b) {
            //a>b
            if (a>c) {
                max=a;
            } else {
                max=c;
            }
        } else {
            if (b>c) {
                max=b;
            } else {
                max=c;
            }
        }
        System.out.println(max);
    }
}

class Zadanie10zrownosca {
    public static void main(String[] args) {
        int a=30, b=7,c=7,max;
        System.out.println(a + " " + b + " " + c);
        if (a>=b) {
            //a>b
            if (a==b || a>c) {
                max=a;
            } else {
                max=c;
            }
        } else {
            if (b==c || b>c) {
                max=b;
            } else {
                max=c;
            }
        }
        System.out.println(max);
    }
}

class Zadanie11 {
    public static void main(String[] args) {
        double dochod=3000;
        double podatek;
        String xxx;
        if (dochod<85528) { podatek=(0.18*dochod)-556.02;
         xxx="ocpja 1";
    }
        else {
            podatek = 14839.02 + (0.32 * (dochod - 85528));
            xxx="opcja2";
        }

        System.out.println(podatek + " "+ xxx);
    }
    }

    class Zadanie8 {

        public static void main(String[] args) {/*
//            8. Napisz aplikację której zadaniem jest liczenie srednich ocen z kilku przedmiotów.
//                    - Aplikacja ma wyliczac średnią wszystkich ocen, srednią ocen z przedmiotów
//            ścisłych (matematyka, chemia, informatyka), oraz średnią z ocen
//            przedmiotów humanistycznych (pozostałe).
//                    - Wszystkie trzy średnie mają być wypisane na ekran. Zwróć uwagę na
//            zaokrąglenia.
//

            //znajdz skrot na odkomentowanie bloku
int ocena_matematyka,ocena_chemia, ocena_j_polski,
ocena_j_angielski, ocena_wos,ocena_informatyka;

float sredniaWszystkie=(ocena_chemia+ocena_informatyka+ocena_j_angielski+ ocena_j_polski+ocena_matematyka+ocena_wos)/6;
float sredniaScisle=(ocena_chemia+ocena_informatyka+ocena_matematyka)/3;
float sredniaHumanistyczna=(ocena_j_angielski+ ocena_j_polski+ocena_wos)/6;

            System.out.println("Srednia ogolna: ->" + sredniaWszystkie);
            System.out.println("Srednia scisle: ->" + sredniaScisle);
            System.out.println("Srednia humanistyczna: ->" + sredniaHumanistyczna);

            //- Jeśli którakolwiek z ocen jest niedostateczna, lub średnia z ocen z którejś
//            części jest niedostateczna, to wyświetl napis: Ocena z [część] jest niedostateczna.

 boolean CzyJestNiedoostateczna=(ocena_matematyka<2 && ocena_chemia, ocena_j_polski,
            ocena_j_angielski, ocena_wos,ocena_informatyka) */
        }
    }

    class OpisScanner {
        public static void main(String[] args) { //Scanner gotowa biblioteka, innym przykladem jest sout
            //wczytanie danych
            //Scanner.metoda
            //nextline zczytuje cala poprzednia linie, nextInt pierwszy napotkany int (kolejne sa ignorowane)

            Scanner scan=new Scanner(System.in); //po pierwszy uzyciu sam dodaje import java.util.Scanner;
            //system.in - wczytanie z klawiatury, mozna tez np z pliku
            String zczytanyTekst=scan.nextLine();
            System.out.println(zczytanyTekst + " Tekst wczytany");

        }
    }

    //pobiera od uzytkownika Imie i wiek, "czesc imie wiem że masz x lat"

class ZadanieScannerSwitch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scan.nextLine(); //po tym znak \n jest usuniety
        System.out.println("Podaj wiek");
        // int wiek = scan.nextInt();
        boolean czywiek = scan.hasNextInt(); //aby sprawdzal poprawnosc
        //jezeli KAsia albo Asia - to moje ulubione imie
        if (czywiek){
            int wiek = scan.nextInt();
                        scan.nextLine(); //aby pozbyc sie tego \n
            //po tym zostaje nieusuniety \n tj 15\, w momencie jak robimy nextline
            // po tym to zaczytuje sie enter tj pusty string

            switch (imie) {
                case "Kasia":
                    System.out.println("Cześć, wiem że masz na imię " + imie + " (to moje ulubone imię), i masz " + wiek + " lat");
                    break;
                case "Asia":
                    System.out.println("Cześć, wiem że masz na imię " + imie + " (to moje ulubone imię), i masz " + wiek + " lat");
                    break;
                default:
                    System.out.println("Cześć, wiem że masz na imię " + imie + " i masz " + wiek + " lat");
                    break;
            }
        } else {
            System.out.println("nie podano liczby");
        }
    }
}

class Imiona {
    public static void main(String[] args) {
        Scanner sImie=new Scanner(System.in);
        System.out.println("podaj imie");
    }
}
