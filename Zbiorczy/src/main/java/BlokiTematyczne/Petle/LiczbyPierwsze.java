package BlokiTematyczne.Petle;

import java.util.Scanner;

class LiczbyPierwsze {
    public static void main(String[] args) {
        boolean czyIjestLiczbaPiersza = true; //zakladamy ze tak poki nie udowodnimy ze jest inaczej
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę wiekszą od zera");
        int liczba = sc.nextInt();


        if (liczba > 0) {
            for (int i = liczba; i > 1; i--) {
                czyIjestLiczbaPiersza = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) { // nie jest liczba pierwsza jesli dzieli sie bez reszty
                        czyIjestLiczbaPiersza = false;
                       /*System.out.println(" j=" + j + " i="+ i + " bezwlg " + i%j);
                    } else {System.out.println(" j=" + j + " i="+ i+ " bezwlg " + i%j);}*/

                    }

                }

                if (czyIjestLiczbaPiersza == true) {
                    System.out.println("i jest liczba pierwsza " + i);
                }
            }
        } else {
            System.out.println("Podano liczbę mniejszą od zera lub równą zeru");
        }
    }
}

/// Samoj sprawdzenie dla 1 liczby
/*
int test=7;
    int pula=0;
        for (int i=2;i<test;i++) {
        if (test % i == 0) {
        pula=pula+1;
        }
        }
        System.out.println("pula " + pula);*/
