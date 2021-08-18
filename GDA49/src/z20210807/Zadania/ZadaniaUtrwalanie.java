package z20210807.Zadania;


import z20210807.podmetody.Metody;

import java.util.Random;
import java.util.Scanner;

public class ZadaniaUtrwalanie {

    public static void main(String[] args) {
   // MetodyZadaniaUtrwalanie.InWar1(2,3);
    //MetodyZadaniaUtrwalanie.InWar2(6);
    //MetodyZadaniaUtrwalanie.InWar3(2,false);
    //MetodyZadaniaUtrwalanie.InWar4(0);
    //MetodyZadaniaUtrwalanie.InWar5(9,9,20);
    //MetodyZadaniaUtrwalanie.InWar6(9,5,3,1);
/*    MetodyZadaniaUtrwalanie.exercise1metodyDisp(2,0);
    System.out.println(MetodyZadaniaUtrwalanie.exercise1metodyRet(3,6));
    int ex1Ret=MetodyZadaniaUtrwalanie.exercise1metodyRet(3,8);
    System.out.println(ex1Ret);
    System.out.println(MetodyZadaniaUtrwalanie.excercise2metoryRet("pierwszy", "drugi"));*/
   // MetodyZadaniaUtrwalanie.exercise3met1(4);
    //System.out.println("Jest dodatnia? " + MetodyZadaniaUtrwalanie.exercise3met2(-4));
       // System.out.println(MetodyZadaniaUtrwalanie.met4("ddddd","wathwaeuitweatgwe4t"));
        //MetodyZadaniaUtrwalanie.met5vel1(11,5);
      //  MetodyZadaniaUtrwalanie.met6potegi(4,3);
       // MetodyZadaniaUtrwalanie.met7wystapienia("akanapa",'a');
       // MetodyZadaniaUtrwalanie.met8ve5(3,5);
       // MetodyZadaniaUtrwalanie.met9("Joanna","Anna"); //czy 1 zawiera 2
        MetodyZadaniaUtrwalanie.met10("Ananz","Joanazaaana"); // czy Anan sie złozy z Joanna - NIEZROBIONE

    }
}

//MAJA BYĆ KAZDA W OSOBNEJ KLASIE

class SRW1 {
    public static void main(String[] args) {
        //1. Stwórz program, który poprosi użytkownika o podanie wartości liczbowej.
        // Następnie program wypisze wszystkie liczby naturalne, aż do zadanej.
        Scanner input= new Scanner(System.in);

        System.out.println("wpisz liczbę całkowitą dodatnią");
        int liczba= input.nextInt();
        while (liczba<0) {
            System.out.println("Podana liczba nie jest całkowitą dodatnią. Wpisz inną liczbę.");
            liczba= input.nextInt();
        }

        System.out.println("Liczby naturalne od 0 do  "+ liczba);

        for (int i=0; i<=liczba;i++) {
            System.out.print(i + " ");
        }
    }
}

class SRW2 { //2. Stwórz program, który poprosi użytkownika o podanie dwóch wartości - długości boków prostokąta.
    // Następnie wypisze pole takiego prostokąta.
    public static void main(String[] args) {

        Scanner userInput=new Scanner(System.in);
        System.out.println("podaj długość pierwszego boku");
        int a= userInput.nextInt();
         while (a<=0) {
             System.out.println("Długość nie może być mniejsza/równa zeru - wprowadz ponownie");
             a= userInput.nextInt();
         }

        System.out.println("podaj długość drugiego boku");
        int b= userInput.nextInt();
        while (b<=0) {
            System.out.println("Długość nie może być mniejsza/równa zeru - wprowadz ponownie");
            b= userInput.nextInt();
        }

        System.out.println("pole prostokąta wynosi: " + a*b);

    }
    }

    class SRW3 { //3. Stwórz program, który będzie zadawał użytkownikowi pytanie "Czy chcesz zakończyć działanie programu",
    // póki odpowiada "nie". Wygoogluj frazę "java String compare".
        public static void main(String[] args) {
            Scanner userInput= new Scanner(System.in);
            String response="";

            do {
                System.out.println("Czy chcesz zakończyć działanie programu");
                response= userInput.next();
            } while (response.toLowerCase().equals("nie"));


        }
    }

    class SRW4 {
    //4. Stwórz program, który wypisze w konsoli 10 losowych wartości z zakresu 15 - 25.
    public static void main(String[] args) {

        Random losowanie=new Random();

for (int i=0;i<1000;i++) {
    //System.out.print((int)(losowanie.nextFloat()*11) + " "); //od 0 do 10
    System.out.print((int)(losowanie.nextFloat()*11) +15 + " "); //od 0 do 10
}

    }
    }

    class SRW5 {
   /* 5. Stwórz program, który spyta użytkownika o podanie figury, której pole chce policzyć:
        kwadratu, prostokąta, koła czy trójkąta. Następnie zgodnie z wyborem zada odpowiednie pytania o wymiary figury i
        wypisze jej pole oraz obwód.
           */

        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Wybierz figurę: 1 - kwadrat; 2 - prostokąt; 3 - koło; 4 - trójkąt");
            int rodzaj= userInput.nextInt();
            double a=0,b=0,c=0,r=0;

            boolean walidacja;

            if (rodzaj==1 || rodzaj==2 ||rodzaj==3 || rodzaj==4) {
                walidacja=true;
            } else {
                walidacja=false;
            }

            while (walidacja==false) {
                System.out.println("Niepoprawny numer figury: wybierz ponownie");
                rodzaj= userInput.nextInt();
                if (rodzaj==1 || rodzaj==2 ||rodzaj==3 || rodzaj==4) {
                    walidacja=true;
                } else {
                    walidacja=false;
                }
            }

            while (walidacja==true) {
                switch (rodzaj) {
                    case 1:
                        while (a<=0) {
                            System.out.println("podaj dodatnią długość boku kwadratu");
                            a = userInput.nextDouble();
                        }
                        System.out.println("Pole kwadratu wynosi: " + a * a + " Obwód kradratu wynosi: " + 4 * a);
                        break;
                    case 2:
                        while (a<=0) {
                            System.out.println("podaj dodatnią długość pierwszego boku prostokata");
                            a = userInput.nextDouble();
                        }
                        while (b<=0) {
                            System.out.println("podaj dodatnią długość drugiego boku prostokąta");
                            b = userInput.nextDouble();
                        }
                        System.out.println("Pole prostokąta wynosi: " + a * b + " Obwód prostokąta wynosi: " + ((2 * a) + (2 * b)));
                        break;
                    case 3:
                        while (r<=0) {
                            System.out.println("Podaj dodatni promień koła");
                            r = userInput.nextDouble();
                        }
                        System.out.println("Pole koła wynosi: " + Math.PI * r * r + " Obwód koła wynosi: " + 2 * Math.PI * r);
                        break;
                    case 4:
                        while (a<=0) {
                            System.out.println("podaj dodatnią długość pierwszego boku trójkąta");
                            a = userInput.nextDouble();
                        }
                        while (b<=0) {
                            System.out.println("podaj dodatnią długość drugiego boku trójkąta");
                            b = userInput.nextDouble();
                        }
                        while (c<=0) {
                            System.out.println("podaj dodatnią długość trzeciego boku trójkąta");
                            c = userInput.nextDouble();
                        }
                        double p = (a + b + c) / 2; //połowa obwodu trójkąta
                        //P=pierw.p(p-a)(p-b)(p-c)
                        double P = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        System.out.println("Pole trójkąta wynosi: " + P + " Obwód trójkąta wynosi: " + (a + b + c));
                        break;
/*                    default: //to się nigdy nie wydarzy
                        System.out.println("wprowadzono niepoprawną wartość");
                        walidacja=false;
                        break;*/
                }
                walidacja=false;
            }
            }
        }

class SRW6 {
/*6. Zmodyfikuj rozwiązanie poprzedniego zadania tak, aby pytanie o figurę było powtarzane,
    póki użytkownik nie poda zamiast figury "koniec".*/

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Wybierz figurę: 1 - kwadrat; 2 - prostokąt; 3 - koło; 4 - trójkąt; 5 - koniec");
        int rodzaj = userInput.nextInt();
        double a = 0, b = 0, c = 0, r = 0;

        boolean walidacjaProgram=true;

        if (rodzaj==5) {
            walidacjaProgram=false;
        }

        boolean walidacjaTyp;

        while (walidacjaProgram == true) {

            if (rodzaj == 1 || rodzaj == 2 || rodzaj == 3 || rodzaj == 4) {
                walidacjaTyp = true;
            } else {
                walidacjaTyp = false;
            }

            while (walidacjaTyp == false) {
                System.out.println("Niepoprawny numer figury: wybierz ponownie");
                rodzaj = userInput.nextInt();
                if (rodzaj == 1 || rodzaj == 2 || rodzaj == 3 || rodzaj == 4) {
                    walidacjaTyp = true;
                } else {
                    walidacjaTyp = false;
                }
            }

            while (walidacjaTyp == true) {
                switch (rodzaj) {
                    case 1:
                        while (a <= 0) {
                            System.out.println("podaj dodatnią długość boku kwadratu");
                            a = userInput.nextDouble();
                        }
                        System.out.println("Pole kwadratu wynosi: " + a * a + " Obwód kradratu wynosi: " + 4 * a);
                        break;
                    case 2:
                        while (a <= 0) {
                            System.out.println("podaj dodatnią długość pierwszego boku prostokata");
                            a = userInput.nextDouble();
                        }
                        while (b <= 0) {
                            System.out.println("podaj dodatnią długość drugiego boku prostokąta");
                            b = userInput.nextDouble();
                        }
                        System.out.println("Pole prostokąta wynosi: " + a * b + " Obwód prostokąta wynosi: " + ((2 * a) + (2 * b)));
                        break;
                    case 3:
                        while (r <= 0) {
                            System.out.println("Podaj dodatni promień koła");
                            r = userInput.nextDouble();
                        }
                        System.out.println("Pole koła wynosi: " + Math.PI * r * r + " Obwód koła wynosi: " + 2 * Math.PI * r);
                        break;
                    case 4:
                        while (a <= 0) {
                            System.out.println("podaj dodatnią długość pierwszego boku trójkąta");
                            a = userInput.nextDouble();
                        }
                        while (b <= 0) {
                            System.out.println("podaj dodatnią długość drugiego boku trójkąta");
                            b = userInput.nextDouble();
                        }
                        while (c <= 0) {
                            System.out.println("podaj dodatnią długość trzeciego boku trójkąta");
                            c = userInput.nextDouble();
                        }
                        double p = (a + b + c) / 2; //połowa obwodu trójkąta
                        //P=pierw.p(p-a)(p-b)(p-c)
                        double P = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        System.out.println("Pole trójkąta wynosi: " + P + " Obwód trójkąta wynosi: " + (a + b + c));
                        break;
/*                    default: //to się nigdy nie wydarzy
                        System.out.println("wprowadzono niepoprawną wartość");
                        walidacja=false;
                        break;*/
                }
                walidacjaTyp = false;

            }
            walidacjaProgram=false;
        }
    }
} //coś jeszcze nie tak --- zerknij na 3