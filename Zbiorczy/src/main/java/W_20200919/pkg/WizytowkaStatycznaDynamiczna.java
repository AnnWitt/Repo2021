package W_20200919.pkg;
//Z tutoriala na SDA

//TO DO: IntelliJ IDEA - pobierz listę skrótów klawiszowych


import java.util.Scanner;
import java.util.*;

public class WizytowkaStatycznaDynamiczna {
    public static void main(String[] args) {//zawsze od tego zaczynamy w klasie, metoda, która uruchamia program
        System.out.println("Wyrzut tekstu na ekran");
        System.out.println(); //pusta linia
        System.out.print("Wyrzut tekstu 2 "); //do tego doklei się ten z kolejnego rzędu
        System.out.println("Wyrzut tekstu , który się doklei do wyrzutu 2");

        {
            System.out.println("+--------------------------+");
            System.out.println("|                          |");
            System.out.println("|       Anna Wittmann      |");
            System.out.println("| ul. Grunwaldzka 30/32B16 |");
            System.out.println("|      80-229 Gdańsk       |");
            System.out.println("|                          |");
            System.out.println("+--------------------------+");


 /*           String str = "Ja  va";
            int actualValue = str.length(); //funkcja zlicza też spacje pomiędzy znakami :)
            System.out.println(actualValue)*/
         }

        //wersja dynamiczna powyższego
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Imie i nazwisko");
            String ImieNazwisko = scan.nextLine();
            System.out.println("Ulica i nr budynku");
            String UlicaNumer = scan.nextLine();
            System.out.println("Kod i miasto");
            String KodMiasto = scan.nextLine();

//dla ciekawostki bo zasadniczo to samo możnaby osiagnac tym poniżej//
            List<Integer> list = new LinkedList<>();
            list.add(ImieNazwisko.length());
            list.add(UlicaNumer.length());
            list.add(KodMiasto.length());

            int MaxLenght=(Collections.max(list));

            System.out.println("max lenmght " + MaxLenght);

            //które najdluzsze

            String najdluzsza;

            /*stąd tez mozna by wyciagnac bez problemu max zwlaszcza, że i tak potrzebowalam wiedziec ktore bylo max aby
            określić czy mamy tu wariant parzysty czy nieparzysty*/
            if (ImieNazwisko.length() >= UlicaNumer.length() && ImieNazwisko.length() >= KodMiasto.length() ) {
                najdluzsza=ImieNazwisko;
            } else {
                if (UlicaNumer.length() >= ImieNazwisko.length() && UlicaNumer.length() >= KodMiasto.length() ) {
                    najdluzsza=UlicaNumer;
                } else {
                    najdluzsza=KodMiasto;
                }
                }

            boolean wariant;

            if (najdluzsza.length() % 2 == 0)
            {System.out.println("najdluzsza parzysta " + najdluzsza.length());
                wariant=true;}
            else
                {System.out.println("najdluzsza nieparzysta "+najdluzsza.length());
                wariant=false;}
            System.out.println(wariant);

        if (wariant) { //to uproszczenie od (wariant==true)
            //// To jest dla wariantu parzystego najdluzszej
            //gorny wiesz
            System.out.print("+");
            {
                for (int j = 1; j <= MaxLenght + 4; j++)
                    System.out.print("-");
            }
            System.out.println("+");
            //dla ImieNazwisko + sprawdzenie czy parzysta - jeżeli nie to dodanie znaku za
            System.out.print("|");
            {
                if (ImieNazwisko.length() % 2 == 0)  //dla parzystej
                {
                    for (int j = 1; j <= (MaxLenght + 4 - ImieNazwisko.length()) / 2; j++)
                        System.out.print(" ");
                    System.out.print(ImieNazwisko);
                    for (int j = 1; j <= (MaxLenght + 4 - ImieNazwisko.length()) / 2; j++)
                        System.out.print(" ");
                } else // dla nieparzystej
                {
                    for (int j = 1; j <= (MaxLenght + 4 - ImieNazwisko.length()) / 2; j++)
                        System.out.print(" ");
                    System.out.print(ImieNazwisko);
                    for (int j = 1; j <= ((MaxLenght + 4 - ImieNazwisko.length()) / 2) + 1; j++)
                        System.out.print(" ");
                }
            }
            System.out.println("|");
            //dla UlicaNumer
            System.out.print("|");
            {
                if (UlicaNumer.length() % 2 == 0)  //dla parzystej
                {
                    for (int j = 1; j <= (MaxLenght + 4 - UlicaNumer.length()) / 2; j++)
                        System.out.print(" ");
                    System.out.print(UlicaNumer);
                    for (int j = 1; j <= (MaxLenght + 4 - UlicaNumer.length()) / 2; j++)
                        System.out.print(" ");
                } else // dla nieparzystej
                {
                    for (int j = 1; j <= (MaxLenght + 4 - UlicaNumer.length()) / 2; j++)
                        System.out.print(" ");
                    System.out.print(UlicaNumer);
                    for (int j = 1; j <= ((MaxLenght + 4 - UlicaNumer.length()) / 2) + 1; j++)
                        System.out.print(" ");
                }
            }
            System.out.println("|");
            //dla KodMiasto
            System.out.print("|");
            {
                if (KodMiasto.length() % 2 == 0)  //dla parzystej
                {
                    for (int j = 1; j <= (MaxLenght + 4 - KodMiasto.length()) / 2; j++)
                        System.out.print(" ");
                    System.out.print(KodMiasto);
                    for (int j = 1; j <= (MaxLenght + 4 - KodMiasto.length()) / 2; j++)
                        System.out.print(" ");
                } else // dla nieparzystej
                {
                    for (int j = 1; j <= (MaxLenght + 4 - KodMiasto.length()) / 2; j++)
                        System.out.print(" ");
                    System.out.print(KodMiasto);
                    for (int j = 1; j <= ((MaxLenght + 4 - KodMiasto.length()) / 2) + 1; j++)
                        System.out.print(" ");
                }
            }
            System.out.println("|");
            //dolny wiesz
            System.out.print("+");
            {
                for (int j = 1; j <= MaxLenght + 4; j++)
                    System.out.print("-");
            }
            System.out.println("+");
        } else {

            //// To jest dla wariantu nieparzystego najdluzszej
            //gorny wiesz
            System.out.print("+");
            {for (int j = 1; j <= MaxLenght+4; j++)
                System.out.print("-");
            }
            System.out.println("+");
            //dla ImieNazwisko + sprawdzenie czy parzysta - jeżeli nie to dodanie znaku za
            System.out.print("|");
            { if (ImieNazwisko.length() % 2 == 0)  //dla parzystej
            {
                for (int j = 1; j <= ((MaxLenght + 4 - ImieNazwisko.length()) / 2)+1; j++)
                    System.out.print(" ");
                System.out.print(ImieNazwisko);
                for (int j = 1; j <= (MaxLenght + 4 - ImieNazwisko.length()) / 2; j++)
                    System.out.print(" ");}
            else // dla nieparzystej
            {
                for (int j = 1; j <= (MaxLenght + 4 - ImieNazwisko.length()) / 2; j++)
                    System.out.print(" ");
                System.out.print(ImieNazwisko);
                for (int j = 1; j <= ((MaxLenght + 4 - ImieNazwisko.length()) / 2); j++)
                    System.out.print(" ");}
            }
            System.out.println("|");
            //dla UlicaNumer
            System.out.print("|");
            { if (UlicaNumer.length() % 2 == 0)  //dla parzystej
            {
                for (int j = 1; j <= ((MaxLenght + 4 - UlicaNumer.length()) / 2)+1; j++)
                    System.out.print(" ");
                System.out.print(UlicaNumer);
                for (int j = 1; j <= (MaxLenght + 4 - UlicaNumer.length()) / 2; j++)
                    System.out.print(" ");}
            else // dla nieparzystej
            {
                for (int j = 1; j <= (MaxLenght + 4 - UlicaNumer.length()) / 2; j++)
                    System.out.print(" ");
                System.out.print(UlicaNumer);
                for (int j = 1; j <= ((MaxLenght + 4 - UlicaNumer.length()) / 2); j++)
                    System.out.print(" ");}
            }
            System.out.println("|");
            //dla KodMiasto
            System.out.print("|");
            { if (KodMiasto.length() % 2 == 0)  //dla parzystej
            {
                for (int j = 1; j <= ((MaxLenght + 4 - KodMiasto.length()) / 2)+1; j++)
                    System.out.print(" ");
                System.out.print(KodMiasto);
                for (int j = 1; j <= (MaxLenght + 4 - KodMiasto.length()) / 2; j++)
                    System.out.print(" ");}
            else // dla nieparzystej
            {
                for (int j = 1; j <= (MaxLenght + 4 - KodMiasto.length()) / 2; j++)
                    System.out.print(" ");
                System.out.print(KodMiasto);
                for (int j = 1; j <= ((MaxLenght + 4 - KodMiasto.length()) / 2); j++)
                    System.out.print(" ");}
            }
            System.out.println("|");
            //dolny wiesz
            System.out.print("+");
            {for (int j = 1; j <= MaxLenght+4; j++)
                System.out.print("-"); //-
            }
            System.out.println("+");
            }

            //!!!!!!!!! Problem - nie wychodzi i zczytanie długości tych +---- -> zwraca liczbę zero

           /* System.out.println(xx);
            int xxx=xx.length();
            System.out.println(xxx);
            //System.out.println(xxx);*/
        }


    }
}

