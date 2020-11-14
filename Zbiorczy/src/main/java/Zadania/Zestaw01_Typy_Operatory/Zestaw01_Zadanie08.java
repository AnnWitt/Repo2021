package Zadania.Zestaw01_Typy_Operatory;

import java.util.Scanner;

class Zestaw01_Zadanie08 {

    public static void main(String[] args) {


int ocena_matematyka,ocena_chemia, ocena_j_polski,
ocena_j_angielski, ocena_wos,ocena_informatyka;

Scanner ocena=new Scanner(System.in);

        System.out.println("Podaj ocenę z matematyki");
        ocena_matematyka=ocena.nextInt();
        System.out.println("Podaj ocenę z chemii");
        ocena_chemia=ocena.nextInt();
        System.out.println("Podaj ocenę z języka polskiego");
        ocena_j_polski=ocena.nextInt();
        System.out.println("Podaj ocenę z języka angielskiego");
        ocena_j_angielski=ocena.nextInt();
        System.out.println("Podaj ocenę z wos");
        ocena_wos=ocena.nextInt();
        System.out.println("Podaj ocenę z informatyki");
        ocena_informatyka=ocena.nextInt();

float sredniaWszystkie=(ocena_chemia+ocena_informatyka+ocena_j_angielski+ ocena_j_polski+ocena_matematyka+ocena_wos)/6f;
float sredniaScisle=(ocena_chemia+ocena_informatyka+ocena_matematyka)/3f;
float sredniaHumanistyczna=(ocena_j_angielski+ ocena_j_polski+ocena_wos)/3f;

        System.out.println("Srednia ogolna: ->" + sredniaWszystkie);
        System.out.println("Srednia scisle: ->" + sredniaScisle);
        System.out.println("Srednia humanistyczna: ->" + sredniaHumanistyczna);

  if ((ocena_chemia==1) || (ocena_informatyka==1) || (ocena_j_angielski==1) || (ocena_j_polski==1) || (ocena_matematyka==1) || (ocena_wos==1)) {
      //System.out.println("przynajmniej jedna z ocen niedostateczna");
      if (ocena_chemia==1) {
          System.out.println("Ocena niedostateczna z chemii");
      }
      if (ocena_informatyka==1) {
          System.out.println("Ocena niedostateczna z informatyki");
      }
      if (ocena_j_angielski==1) {
          System.out.println("Ocena niedostateczna z języka angielskiego");
      }
      if (ocena_j_polski==1) {
          System.out.println("Ocena niedostateczna z języka polskiego");
      }
      if (ocena_matematyka==1) {
          System.out.println("Ocena niedostateczna z matematyki");
      }
      if (ocena_wos==1) {
          System.out.println("Ocena niedostateczna z WOS");
      }


      if (sredniaWszystkie<2 || sredniaHumanistyczna<2 || sredniaScisle<2 ) {
          //System.out.println("przynajmniej jedna ze średnich niedostateczna");

          if (sredniaHumanistyczna<2) {
              System.out.println("średnia za przedmioty humanistyczne niedostateczna");
          }
          if (sredniaScisle<2) {
              System.out.println("średnia za przedmioty ścisłe niedostateczna");
          }
          if (sredniaWszystkie<2) {
              System.out.println("średnia za wszystkie przedmioty niedostateczna");
          }

      }



  }


    }
}
