package Zadania.Do_Zrobienia.ZWczesniejszych.pkg.Zestaw04_Zadanie16.pkg;

import java.util.Scanner;

public class Zestaw04_Zadanie16Wyw {

    public static void main(String[] args) {
/*        Zestaw04_Zadanie16Konst kontr = new Zestaw04_Zadanie16Konst();
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj x");*/
        //char x=input.;
        //kontr.setX()=;
       /* char x= kontr.getX();
        char y= kontr.getY();*/
        Zestaw04_Zadanie16Konst kontr = new Zestaw04_Zadanie16Konst();
        char[][] TblWyw=new char[3][3];

        TblWyw=kontr.Uzup(2,1);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(TblWyw[i][j] + " ");
                //System.out.print(TblChar[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(kontr.Uzup(1,3));
    }
}
