package Zadania.Zestaw01_Typy_Operatory;


import java.util.Random;
import java.util.Scanner;

public class Zestaw01_Zadanie13 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int N=scan.nextInt();
        int Losowa;
        double dLosowa;

        System.out.println("a. losuje " + N + " liczb całkowitych (dowolny zakres) i wypisuje je na ekran");
        for (int i=1;i<=N;i++) {
            dLosowa=(Math.random()*10); //zakres od zera do 9
            Losowa= (int) dLosowa;
            System.out.println("Liczba losowa nr " +i+ " = " +Losowa);
        }

        System.out.println("b.losuje " + N + " liczb zmiennoprzecinkowych i wypisuje je na ekran");
        for (int i=1;i<=N;i++) {
            dLosowa=Math.random();
            System.out.println("Losowa zmiennoprzecinkowa nr "+i+ " = "+ dLosowa);
        }

        System.out.println("c. losuje " + N + " razy wartość boolean i wypisuje je na ekran");
        Random rand=new Random();

        for (int i=1;i<=N;i++) {
            boolean logiczna = rand.nextBoolean();
            System.out.println("Losowa wartość logiczna nr "+ i + " = " + logiczna);
        }

        //Random generator = new Random();
        //int wylosowana = generator.nextInt(); // do zmiennej 'wylosowana' zostanie przypisana losowa wartosc

        System.out.println("d. pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje " + N + " liczb całkowitych");

        Scanner zczyt=new Scanner(System.in);
        System.out.println("Podaj dolny zakres przedziału (od)");
        int dolny_zakres=zczyt.nextInt();
        System.out.println("Podaj górny zakres przedziału (do)");
        int gorny_zakres= zczyt.nextInt();

        if (dolny_zakres>gorny_zakres) {
            //zamiana liczb w razie niepoprawnych wartosci
            System.out.println("podano niepoprawne zakresy - korekta");
            dolny_zakres=dolny_zakres+gorny_zakres;
            gorny_zakres=dolny_zakres-gorny_zakres;
            dolny_zakres=dolny_zakres-gorny_zakres;
            System.out.println("dolny zakres= " + dolny_zakres+" a gorny = "+ gorny_zakres);
        }
        int ile_liczb=gorny_zakres-dolny_zakres+1;
        //przedział - <a;b> => ile liczb pomiędzy => b-a+1

        for (int i=1;i<=N;i++) {
            System.out.println(i + " Losowa liczba z przedziału od " + dolny_zakres + " do " + gorny_zakres + " to " + (rand.nextInt((ile_liczb)) + dolny_zakres));
        }

        //e. pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje N
        //liczb zmiennoprzecinkowych z tego zakresu, a następnie wypisuje je na ekran

        System.out.println("e. pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje " + N +" liczb zmiennoprzecinkowych z tego zakresu");
        System.out.println("Podaj dolny zakres przedziału (od)");
        dolny_zakres=zczyt.nextInt();
        System.out.println("Podaj górny zakres przedziału (do)");
        gorny_zakres= zczyt.nextInt();

        if (dolny_zakres>gorny_zakres) {
            //zamiana liczb w razie niepoprawnych wartosci
            System.out.println("podano niepoprawne zakresy - korekta");
            dolny_zakres=dolny_zakres+gorny_zakres;
            gorny_zakres=dolny_zakres-gorny_zakres;
            dolny_zakres=dolny_zakres-gorny_zakres;
            System.out.println("dolny zakres= " + dolny_zakres+" a gorny = "+ gorny_zakres);
        }
        ile_liczb=gorny_zakres -dolny_zakres;

        for (int i=1;i<=N;i++) {
            System.out.println(i + " Losowa liczba zmiennoprzecinkowa z przedziału od " + dolny_zakres + " do " + gorny_zakres + " to " + ((rand.nextDouble()*ile_liczb)+dolny_zakres));
        }

    }

}
//Rozwiąż to zadanie wykorzystując mechanizm losowania liczb z klasy Random oraz z
//klasy Math (metoda random()).