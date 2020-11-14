package W_20200919.pkg;

import java.util.Scanner;

public class TEST1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*        {
            System.out.println("Jak masz na imię?");
            String imie = scan.nextLine();
            System.out.println("czesc " + imie);
        }*/
        {
            System.out.println("Wpisz liczbę");
            Boolean int1 = scan.hasNextInt();
            //System.out.println(int1);

            int xx=10;
            System.out.println(xx);
            if (int1 == false) {
                System.out.println("To nie jest liczba");
            }
             else{

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
               xx=scan.nextInt(); //dlaczego tu sie nie konczy program skoro ponizsze dziala po zakomentowaniu tego wiersza
                System.out.println("Lioczba 1 = " + (scan.nextInt() + 4+xx));
                System.out.println("Liczba 2  = " + (xx + 6));
            }





            }
        }
    }

