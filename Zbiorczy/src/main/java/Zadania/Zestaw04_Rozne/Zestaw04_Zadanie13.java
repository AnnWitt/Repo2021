package Zadania.Zestaw04_Rozne;

public class Zestaw04_Zadanie13 {

    public static void main(String[] args) {

    String[] Tablica =new String[8];
        String[] Test =new String[9];

    //a
        System.out.println("a");
                for (int j=0;j<8;j++) {
                    if (j>0) {
                        Tablica[j] = "#" + Tablica[j - 1];
                        System.out.println(Tablica[j]);
                    } else {
                        Tablica[j] = "#";
                        System.out.println(Tablica[j]);
                    }
                }


       //b
        System.out.println();


        System.out.println("b");

        for (int j=0;j<8;j++) {
            System.out.println();
            if (j<=0) {
                for (int i=0;i<8;i++){
                    Tablica[i]="#";
                    System.out.print(Tablica[j]);
                }
            } else {
                for (int k=j;k<8;k++){
                    Tablica[k] = "#";
                    System.out.print(Tablica[k]);
                }
            }
        }


        System.out.println();
        System.out.println();
//c
        System.out.println("c");




        System.out.println();

        for (int clean=0;clean<8;clean++) {
            Test[clean]="#";
        }

    for (int i = 1; i < 9; i++) {
            Test[i-1]=" ";
            Test[i] = "#";
            for (int k=1;k<8;k++) {
                System.out.print(Test[k]);
        }
        System.out.println(Test[i]);
    }
    System.out.println();


//d
        System.out.println("d");


        for (int i = 8; i >=1 ; i--) {

            for (int k=0;k<=(i-1);k++) {
                Test[k]=" ";
            }

            Test[i] = "#";
            for (int k=1;k<8;k++) {
                System.out.print(Test[k]);
            }
            System.out.println(Test[i]);
        }
        System.out.println();




        //koniec klasy
    }
}

//kostka
/*        for (int i=0;i<8;i++){
        for (int j=0;j<8;j++) {
        System.out.print(Tablica[j]);
        //System.out.println();
        }
        System.out.println();
        }*/
