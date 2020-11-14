package Zadania.Do_Zrobienia.ZWczesniejszych.pkg.Zestaw04_Zadanie16.pkg;

import java.util.Scanner;

public class Zestaw04_Zadanie16Konst {

/*.*** Zaimplementuj grę w kółko i krzyżyk na planszy 3x3 użyj tablic dwuwymiarowych.
    Pozwól użytkownikowi wybrać czy gra kółkiem czy krzyżykiem, dla uproszczenia wybór
    pola dokonaj poprzez pobranie pojedynczej liczby, tak jak pokazane na obrazku niżej.
    Po każdym wyborze wyświetl zaktualizowaną planszę gry*/
char x;
char y;


    char[][] daneGry=new char[3][3];
/*    public boolean czyKoniecGry() {
        //daneGry
    }*/
/*    public boolean postawZnak(char znak, int x, int y) {
        // sprawdz czy moge
        boolean b = czyMogePostawicZnak(znak, x, y);
        //if(b) to postaw jeslinie to nie i zwoc
    }*/
/*    private boolean czyMogePostawicZnak(char znak, int x, int y) {

    }*/
    public void narysujPlansze() {
    }

    public Zestaw04_Zadanie16Konst() {
        this.x = x;
        this.y = y;
    }

    public char getX() {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj x");
        char x=getX();
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }

    public char getY() {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj y");
        //char y=setY(input.hasNextLine(y))
        y=getY();
        return y;
    }

    public void setY(char y) {
        this.y = y;
    }

    public static char[][] Uzup (int x,int y)  {
        char[][] TblChar=new char[3][3];
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++){
                if ((i==x) && (j==y)) {
                    i=x;
                    j=y;
                    TblChar[x][y]=8;
                    System.out.println(TblChar[i][j]);
                }
            }
        }
        return TblChar;
//
    }

}
