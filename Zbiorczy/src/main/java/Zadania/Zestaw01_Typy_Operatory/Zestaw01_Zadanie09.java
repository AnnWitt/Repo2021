package Zadania.Zestaw01_Typy_Operatory;

import java.util.Scanner;

public class Zestaw01_Zadanie09 {
    public static void main(String[] args) {

        Scanner temp=new Scanner(System.in);
        System.out.println("Podaj temp w stopniach Celsjusza");
        int Celsjusz= temp.nextInt();
        double Fahrenheit=(1.8*Celsjusz)+32;
        System.out.println("Fahrenheit " + Fahrenheit);
    }
}
