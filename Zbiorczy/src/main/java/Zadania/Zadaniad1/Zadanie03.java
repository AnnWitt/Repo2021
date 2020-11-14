package Zadania.Zadaniad1;

public class Zadanie03 {

    public static void main(String[] args) {

       int x=6;
       int y=3;

       if (x>y) {
           x=x+y;
           y=x-y;
           x=x-y;
       }

       int suma=0;

       for (int i=x;i<=y;i++) {
           suma=suma+i;
       }

        System.out.println(suma);



     //
    }
}
