package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Zestaw09_Zadanie10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj słowo");
        String slowo=input.nextLine();

        //WAŻNEEEEEEEEEEE
       String[] tabLitery=slowo.split("");
        System.out.println(Arrays.toString(tabLitery));

        String litera=tabLitery[slowo.length()-1];
        int licznik=0;

        for (int i=0;i<slowo.length();i++) {
            if (tabLitery[i].equals(litera)) {
                licznik=licznik+1;
            }
        }
        System.out.println("W słowie " + slowo + " litera " + litera+ " będąca ostatnią literą, występuje " + licznik+ " razy");

   //
    }
}
