package z20210807.Zadania;

public class MetodyZadaniaUtrwalanie {

    //Instrukcja warunkowa
/*1. Zadeklaruj dwie zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość większej z nich.
    Do sprawdzenia, która jest większa użyj instrukcji warunkowej.*/

    static void InWar1(int liczba1, int liczba2) { //private package
        if (liczba1 > liczba2) {
            System.out.println("Wieksza jest liczba " + liczba1);
        } else {
            System.out.println("Wieksza jest liczba " + liczba2);
        }
    }

/*    2. Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie (wypisz w konsoli odpowiedni
            komunikat).*/

    static void InWar2(int liczba) {
        if (liczba % 2 == 0) {
            System.out.println("Liczba: " + liczba + " jest parzysta");
        } else {
            System.out.println("Liczba: " + liczba + " jest nieparzysta");
        }
    }

/*    3. Zadeklaruj dwie zmienne, jedna reprezentująca temperaturę (liczba całkowita), druga to
    wartość logiczna reprezentująca to, czy pada deszcz. Przypisz zmiennym wartości. Następnie
    wypisz w konsoli, czy pogoda jest ładna, czy nie, przy użyciu instrukcji warunkowej. Pogoda
    jest ładna, gdy temperatura jest większa lub równa 20 i gdy nie pada deszcz.*/

    static void InWar3(int temperatura, boolean czyDeszcz) {
        if (temperatura >= 20 && czyDeszcz == false) {
            System.out.println("ładna pogoda");
        } else {
            System.out.println("brzydka pogoda");
        }

    }


/*4. Sprawdź, czy wartość zmiennej jest większa, mniejsza, czy równa zero (wyszukaj w sieci frazę
            "java else if").*/

    static void InWar4(int zmienna) {
        if (zmienna >0) {
            System.out.println("liczba " + zmienna + " jest większa od zera");
        } else if (zmienna <0) {
            System.out.println("liczba " + zmienna + " jest mniejsza od zera");
        } else {
            System.out.println("liczba " + zmienna + " jest równa zeru");
        }
    }

/*    5. Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz
    wartość największej z nich.*/

    static void InWar5(int liczba1, int liczba2, int liczba3) {
        int max;
        if (liczba1>liczba2) {
            max=liczba1;
        } else {
            max=liczba2;
        }

        if (liczba3>max) {
            max=liczba3;
        }

        System.out.println("Największą liczba jest: " +max);
    }

//6. Rozwiąż zadanie 1. dla czterech zmiennych.
/*1. Zadeklaruj dwie zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość większej z nich.
    Do sprawdzenia, która jest większa użyj instrukcji warunkowej.*/

    static void InWar6(int liczba1, int liczba2, int liczba3, int liczba4) {
        int m1;
        int m2;
/*        if (liczba1>liczba2) {
            m1=liczba1;
        } else {
            m1=liczba2;
        }*/
        m1 = liczba1>liczba2 ? liczba1: liczba2;
        m2 = liczba3>liczba4 ? liczba3: liczba4;
        m2 = m2>m1 ? m2: m1;
        System.out.println(m2);
        //System.out.println(return (m1>m2) ? m1: m2);
        //return (m1>m2) ? m1: m2; //nie da rady bo to jest void
        //return foundNumbers.isEmpty() ? Collections.singletonList(-1) : foundnumbers
    }

//Metody
 /*   1. Stwórz metodę exercise1, która przyjmie dwa parametry typu int, a która zwróci
    wynik mnożenia tych parametrów.*/
    static void exercise1metodyDisp(int a, int b) {
        System.out.println("Wynik mnożenia "+ a +" i " + b + " wynosi " + a*b);
    }

    static int exercise1metodyRet(int a, int b) {
        return a*b;
    }

/*2. Stwórz metodę exercise2, która przyjmie dwa łańcuchy znaków jako parametry, a która zwróci
    ich konkatenację.*/

    static String excercise2metoryRet (String ciag1,String ciag2) {
        return ciag1.concat(ciag2);
    }

/*3. Stwórz metodę exercise3, która przyjmie parametr typu int. Metoda zwróci odpowiedź
    na pytanie, czy wartość jest dodatnia.*/

    static void exercise3met1(int liczba) {
        if (liczba>=0) {
            System.out.println("Dodatnia");
        } else {
            System.out.println("ujemna");
        }
    }

    static boolean exercise3met2(int liczba) {
        return liczba>=0;
    }

/*4. Stwórz metodę, która przyjmie dwa parametry typu String. Metoda zwróci dłuższy z
    tych tekstów. Jeśli oba są równej długości, metoda zwróci pierwszy z nich.*/

    static String met4 (String ciag1, String ciag2) {
        if (ciag1.length()==ciag2.length()) {
            return ciag1;
        } else if (ciag1.length()>ciag2.length()) {
            return ciag1;
        } else {
            return ciag2;
        }
    }

/*    5. Stwórz metodę, która zadziała tak jak w metoda z zadania 1., ale wynik policzy
    wykorzystaniem wielokrotnego dodawania. Niech rozwiązanie zadziała dla liczb nieujemnych.*/
             /*   1. Stwórz metodę exercise1, która przyjmie dwa parametry typu int, a która zwróci
    wynik mnożenia tych parametrów.*/

    static void met5vel1 (int liczba1,int liczba2) {
        // 3 * 5 = 15
     /*   liczba1=3;
        liczba2=5;*/
        int licznik=liczba2;
        for(int i=1;i<liczba1;i++) {
            licznik=licznik+liczba2;
        }
        System.out.println(liczba1 + " razy " + liczba2 + " = " + licznik);
    }


/*    6. Stwórz metodę, która przyjmie dwa parametry typu int, a która zwróci wynik
    potęgowania o podstawie i wykładniku takich, jak przekazano.*/

    static void met6potegi (int podstawa, int wykladnik) {
        //4^3 --> 64
       // int licznik=podstawa;

//sprobuj recznie
        System.out.println(Math.pow(podstawa,wykladnik));

    }

/*    7. Stwórz metodę, która przyjmie jako pierwszy parametr wartość typu String,
    a jako drugi znak. Metoda zwróci liczbę wystąpień znaku w łańcuchu.*/

    static void met7wystapienia (String ciag,char znak) {
        //kanapa 'a'
        int licznik=0;
        for (int i=0; i<(ciag.length());i++) {
            if (ciag.charAt(i)==znak) {
                licznik=licznik+1;
            }
        }
        System.out.println("liczba znakow " + licznik);
    }

/*8. Popraw działanie metody z zadania 5 tak, aby zadziałała również dla liczb ujemnych.*/

    static void met8ve5 (int liczba1,int liczba2) {
        int znak=0;
        int liczba1start=liczba1;
        int liczba2start=liczba2;
    if (liczba1<0) { znak=-1;liczba1=liczba1*(-1); }
    if (liczba2<0) { znak=znak-1;liczba2=liczba2*(-1); }
    if (znak==-2) { znak=1; } else if (znak==0) { znak=1; }
        System.out.println(liczba1start + " " + liczba2start+ " "+znak + " "+liczba1+ " "+ liczba2);
        int licznik=liczba2;
        for(int i=1;i<liczba1;i++) {
            licznik=licznik+liczba2;
        }
        System.out.println(liczba1start + " razy " + liczba2start + " = " + licznik*znak);
    }

    //9. Stwórz metodę, która przyjmuje dwa łańcuchy jako parametry, a która zwraca informację, czy pierwszy łańcuch zawiera drugi.

    static void met9 (String s1, String s2) {
        String ss1=s1.toLowerCase();
        String ss2=s2.toLowerCase();
        if (ss1.contains(ss2)==true) {
            System.out.println("W słowie " + s1 + " znajduje się słowo " + s2);
        } else {
            System.out.println("W słowie " + s1 + " nie znajduje się słowo " + s2);
        }


    }

    //10. Stwórz metodę, która sprawdzi, czy jeden łańcuch znaków zawiera wszystkie znaki z drugiego łańcucha
    // (jeden znak w pierwszym nie może reprezentować więcej niż jednego w drugim).

    static void met10 (String s1, String s2) {
        String ss1=s1.toLowerCase();
        String ss2=s2.toLowerCase();
        System.out.println("ss1: "+ ss1+ " ss2: "+ ss2);

        String tss1[]=new String[ss1.length()];
        for (int i=0; i<ss1.length();i++) {
            tss1[i]=String.valueOf(ss1.charAt(i));
            System.out.print(tss1[i]);
        }
        System.out.println();
        String tss2[]=new String[ss2.length()];
        for (int i=0; i<ss2.length();i++) {
            tss2[i]=String.valueOf(ss2.charAt(i));
            System.out.print(tss2[i]);
        }

        boolean test;
        int licznik=0;

        for (int x=0;x<ss1.length();x++) {
            for (int y=0;y<ss2.length();y++) {
                if (tss1[x].equals(tss2[y])) {
                    tss2[y]=null;
                    licznik=licznik+1;
                    break;
                } else {

                }

            }

        }

        System.out.println();
        System.out.println("licznik nulli " + licznik);

        if (licznik<ss1.length()) {
            System.out.println("fałsz: z ciągu znaków " + s2 + " nie złożymy ciągu " + s1);
        } else {
            System.out.println("prawda: z ciągu znaków " + s2 + " złożymy ciąg " + s1);
        }
    }





}
