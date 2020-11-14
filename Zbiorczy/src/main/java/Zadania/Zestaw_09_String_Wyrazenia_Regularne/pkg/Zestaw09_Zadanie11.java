package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Zestaw09_Zadanie11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Wprowadz słowo");
        String slowo=input.nextLine();


        String[] tbl=slowo.split("");
        for (int i=(tbl.length)-1;i>=0;i--) {
            System.out.print(tbl[i]);
        }

    }

}
