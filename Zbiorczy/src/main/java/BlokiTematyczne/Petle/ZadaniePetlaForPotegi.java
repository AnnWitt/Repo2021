package BlokiTematyczne.Petle;

import java.util.Scanner;

class ZadaniePetlaForPotegi {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("podaj a ");
        int a = liczba.nextInt();
        System.out.println("podaj b");
        int b = liczba.nextInt();
        int potega = a;
        if (b != 0) {
            //blad - 3^0 =1
            for (int i = 1; i < b; i++) { //i=i+2  <--> i += 2) //to co było zwiekszone o dwa
                potega = potega * a;
                //potega *=n; zapis skrocony = powyzszemu
            }
        } else {
            potega = 1;
        }
        System.out.println(a + " do potęgi " + b + " = " + potega);

    }


}
