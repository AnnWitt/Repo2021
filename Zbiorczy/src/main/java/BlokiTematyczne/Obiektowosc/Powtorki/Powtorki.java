package BlokiTematyczne.Obiektowosc.Powtorki;

import java.util.Arrays;

public class Powtorki {

    public static void main(String[] args) {

        String anyString = "ICC Intercity";
        return;
    }

}


class Tablice_copy {

    public static void main(String[] args) {
        int[] tbl1 = new int[]{2, 6, 8};
        int[] tbl1_copy = new int[tbl1.length];
        tbl1_copy = tbl1;  //// uwaga zmiana w jednej spowoduje tez zmiane w drugiej

        for (int i = 1; i < tbl1_copy.length; i++) {
            System.out.println(tbl1_copy[i] + " " + tbl1[i]);

        }

        System.out.print(Arrays.toString(tbl1_copy));
    }
}

class PorownanieStringow {
    public static void main(String[] args) {
        String s1 = "xxx";
        String s2 = new String("xxx");
        String s3 = new StringBuilder().append("xxx").toString();

        System.out.println(s1 + " " + s2 + " " + s3);

        System.out.println("zwylle przypisanie == s1s2 ");
        System.out.println(s1 == s2);
        System.out.println("new string == s1s3 ");
        System.out.println(s1 == s3);
        System.out.println("string builder == s3s2 ");
        System.out.println(s3 == s2);

        System.out.println("zwylle przypisanie .equals s1s2 " + s1.equals(s2));
        System.out.println("new string .equals s1s3 " + s1.equals(s3));
        System.out.println("string builder .equals s3s2 " + s3.equals(s2));

    }
}

class CharAtPrzyklad {
    public static void main(String[] args) {
        String test = "Dowolny";
        System.out.println(test.charAt(5));
        char charTest = (char) test.charAt((5));
        System.out.println((int) charTest);

    }
}

class IsEmptyPrzyklad {
    public static void main(String[] args) {
        System.out.println(SubStringPrzyklad.main()); //bo public static String main(),
        // tu brak argumentów i tam brak. String zamiast void aby zwróciło wynik. wywalilo
        // wszystko z tej klasy
        //przypiszmy to do zmiennej
        String nowaImport = SubStringPrzyklad.main();
        System.out.println("nowa " + nowaImport);
        String TekstZaimportowanyNiepusty = nowaImport + " any";
        System.out.println("nowa import + any " + TekstZaimportowanyNiepusty);
        String tekstPusty = "";
        String tekstZeSpacja = " "; //tzw bialy
        String tekstBezDeklaracji;

        //sprawdzamy czy pusty

        System.out.println("IsEmpty TekstZaimportowanyNiepusty " + TekstZaimportowanyNiepusty.isEmpty());
        System.out.println("IsEmpty Tekst pusty " + tekstPusty.isEmpty());
        System.out.println("IsEmpty Tekst ze spacja " + tekstZeSpacja.isEmpty());
        //System.out.println("Tekst m" + m.isEmpty()); //nie pozwoli bez deklaracji, to null

    }
}

//z przykładem zaczytu
class IndexOfTest {
    public static void main(String[] args) {
        PrzykladowyString testIndexOf= new PrzykladowyString(); //tak jak random, to jest klasa
        System.out.println(testIndexOf.PString()); //tu zaczyt samej metody jak np lenght
        //czasem sie nie podpowiada tylko trzeba wpisać
        //zaczyt z public class z innego pliku
        Zaczyty testZaczyt=new Zaczyty(); //nie jest zmienna tylko klsa, dopiero przypis
        System.out.println("zaczyt z innego pliku "+ testZaczyt.PString2()); //tez sie nie podpowiedział
        String ZmiennaTestZaczyt=testZaczyt.PString2();
        System.out.println("Zmienna z zaczytem "+ ZmiennaTestZaczyt);
        System.out.println("index of  "+ ZmiennaTestZaczyt.indexOf('t')); //liczone od zera
    }
}

class SplitReplaceTest {
    public static void main(String[] args) {
        Zaczyty klasaZaczytu=new Zaczyty();
        String zaczytanaWartosc=klasaZaczytu.PString2();
        System.out.println(zaczytanaWartosc);
       System.out.println(klasaZaczytu); //takie cos zwroci pozycje w pamieci
        String[] PodzialPoT=zaczytanaWartosc.split("t");
        System.out.println(Arrays.toString(PodzialPoT)); //wyswietla jako tablice stringow
        String[] PodzialPoSpacji=zaczytanaWartosc.split(" ");
        System.out.println(Arrays.toString(PodzialPoSpacji)); //wyswietla jako tablice stringow
        //Znak rozdzielający zostaje pomijany!
        //teraz replace sprobujemy
        System.out.println("Replace Metoda " +Arrays.toString(PodzialPoSpacji).replace('w','X')); //metoda
        System.out.println("Replace Funkcja " + Arrays.toString(PodzialPoSpacji).replace("w","DUPA")); //funkcja
    }
}

class ContainsTrimTest {
    public static void main(String[] args) {
        Zaczyty testZaczyt=new Zaczyty();
        String zaczytanaZmmienna=testZaczyt.PString2();
        System.out.println(zaczytanaZmmienna);
        System.out.println("Czy zawiera y " + zaczytanaZmmienna.contains("y"));
    }
}

class PrzykladVarargs {

    public static void main(String[] args) {
        System.out.println("metodą statyczną int");
        Zaczyty.TblVarargs(2,5,6,7,8);
        Zaczyty.TblVarargs(1,2,3); //xx

        int[] KopiaTblVarargsClone=Zaczyty.TblVarargs(1,2,3).clone(); //!!!!!!!!!!!!!
        int[] KopiaTblVarargsRownosc=Zaczyty.TblVarargs(1,2,3);//.clone(); //!!!!!!!!!!!!!

        //Pytanie: czy ma tu znaczenie clone cyz =
        KopiaTblVarargsRownosc[0]=100;
        System.out.println("proba kopii tablicy z metody varargs klone  " + KopiaTblVarargsClone[2]);

        System.out.println("drugi raz");
        Zaczyty.TblVarargs(1,2,3);





        //int[] TblX_void=new int[Zaczyty.TblVarargs_void(2,6,3,8,0,2)]; --> zwroci blad bo void
        System.out.println();
        System.out.println("voidem");
        Zaczyty.TblVarargs_void(2,5,6,7,8);



    }




}
