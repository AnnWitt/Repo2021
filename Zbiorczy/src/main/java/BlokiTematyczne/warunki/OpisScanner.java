package BlokiTematyczne.warunki;

import java.util.Scanner;

class OpisScanner {
    public static void main(String[] args) { //Scanner gotowa biblioteka, innym przykladem jest sout
        //wczytanie danych
        //Scanner.metoda
        //nextline zczytuje cala poprzednia linie, nextInt pierwszy napotkany int (kolejne sa ignorowane)

        Scanner scan = new Scanner(System.in); //po pierwszy uzyciu sam dodaje import java.util.Scanner;
        //system.in - wczytanie z klawiatury, mozna tez np z pliku
        String zczytanyTekst = scan.nextLine();
        System.out.println(zczytanyTekst + " Tekst wczytany");

    }
}
