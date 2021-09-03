package z20210807.wyrazeniaregularne.Zadania;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegSRC {

    //// 1. Sprawdź, czy tekst składa się z samych cyfr.
    static void czyNumery (String ciagZnakow) {
        System.out.print("Zad 1: Sprawdź, czy tekst składa się z samych cyfr. ");
        String ciagZnakowWzorzec="\\d+";
    Pattern wzorzec= Pattern.compile(ciagZnakowWzorzec);
    Matcher dopasowanie=wzorzec.matcher(ciagZnakow);
        System.out.println("dla ciągu znaków " + ciagZnakow + ": " +dopasowanie.matches());
    }


    ////2. Sprawdź, czy tekst składa się wyłącznie z małych znaków angielskiego alfabetu.
    static void czyMaleZnakiAng (String ciagZnakow) {
        System.out.print("Zad 2: Sprawdź, czy tekst składa się wyłącznie z małych znaków angielskiego alfabetu. ");
        String ciagZnakowWzorzec="[a-z]+";
        Pattern wzorzec=Pattern.compile(ciagZnakowWzorzec);
        Matcher dopasowanie= wzorzec.matcher(ciagZnakow);
        System.out.println(" Dla ciągu znaków " + ciagZnakow + ": "+ dopasowanie.matches());
    }

    ////3. Zapisz łańcuch znaków, który pasuje do wyrażenia regularnego \\d+a*
    static void lancuchWyrazenie1 (String ciagZnakow) {
        System.out.print("Zad 3: Zapisz łańcuch znaków, który pasuje do wyrażenia regularnego \\\\d+a*");
        String ciagZnakowWzorzec="\\d+a*"; //jedno lub wiecej dla liczby, zero lub wiecej dla a
        Pattern wzorzec=Pattern.compile(ciagZnakowWzorzec);
        Matcher dopasowanie= wzorzec.matcher(ciagZnakow);
        System.out.println(" Dla ciągu znaków " + ciagZnakow + ": " + dopasowanie.matches());
    }

    //4. Zapisz łańcuch znaków, który pasuje do wyrażenia regularnego 5?1?a+
    static void lancuchWyrazenie2 (String ciagZnakow) {
        System.out.print("Zad 4: Zapisz łańcuch znaków, który pasuje do wyrażenia regularnego 5?1?a+");
        String ciagZnakowWzorzec="5?1?a+";  // ? - zero lub jedno, + jedno lub wiecej
        Pattern wzorzec=Pattern.compile(ciagZnakowWzorzec);
        Matcher dopasowanie= wzorzec.matcher(ciagZnakow);
        System.out.println(" Dla ciągu znaków " + ciagZnakow + ": " + dopasowanie.matches());
    }

// 5. Sprawdź, czy tekst składa się jedynie z samych znaków alfanumerycznych i białych znaków.
 static void alfaNumBiale (String ciagZnakow) {
        //\w – znak używany w słowach [a-zA-Z0-9_] (zauważ, że mamy tu znak _),
     //\s – tak zwane białe znaki czyli znak spacji czy tabulacji [ \t\n\r\f\x0B].
     // Możesz je opisać jako znaki, które nie są widoczne podczas wydruku,
     System.out.print("Zad 5: Sprawdź, czy tekst składa się jedynie z samych znaków alfanumerycznych i białych znaków.");
       // String ciagZnakowWzorzec="\\w+"; false dla spacji
        //String ciagZnakowWzorzec="[a-zA-Z0-9]+"; // male, wielkie i litery - kolejnosc bez znaczeniaale biale znaki false

     //Te trzy zapisy =
       // String ciagZnakowWzorzec="[a-zA-Z0-9\\s]+"; // male, wielkie i litery - kolejnosc bez znaczenia, białe też
       // String ciagZnakowWzorzec="[\\sa-zA-Z0-9]+"; // male, wielkie i litery - kolejnosc bez znaczenia, białe też
       String ciagZnakowWzorzec="[\\s\\w]+"; // male, wielkie i litery, białe - kolejnosc bez znaczenia

     Pattern wzorzec=Pattern.compile(ciagZnakowWzorzec);
     Matcher dopasowanie= wzorzec.matcher(ciagZnakow);
     System.out.println(" Dla ciągu znaków " + ciagZnakow + ": " + dopasowanie.matches());
 }

//6. Sprawdź, czy w tekście występuje cyfra.
    static void czyCyfraWtekscie (String tekst) {
        System.out.print("Sprawdź, czy w tekście występuje cyfra. ");
        //String wzorzecTekst="[\\w\\s]+\\d[\\w\\s]+";
        String wzorzecTekst="\\D+"; //\D – jakikolwiek znak, który nie jest cyfrą [^0-9],
        Pattern wzorzec = Pattern.compile(wzorzecTekst);
        Matcher dopasowanie= wzorzec.matcher(tekst);
        if (dopasowanie.matches()==false) {
            System.out.println(" Dla ciągu "+ tekst + " : występuje cyfra" + " -----\"\\\\D+\" ---> dopasowanie.matches() " + dopasowanie.matches());
        } else {
            System.out.println(" Dla ciągu "+ tekst + " : nie występuje cyfra"+ " ------\"\\\\D+\" ---> dopasowanie.matches() " + dopasowanie.matches());
        }
    }

    //7. Napisz wyrażenie regularne, które sprawdzi, czy tekst ma format XX.XX.XXXX, gdzie X to cyfry.

    static void czyFormatxxXXxxxx (String tekst) {
        System.out.print("Zad 7. Napisz wyrażenie regularne, które sprawdzi, czy tekst ma format XX.XX.XXXX, gdzie X to cyfry.");
        String tekstWzorzec="\\d{2}[.]\\d{2}[.]\\d{4}";
        Pattern wzorzec=Pattern.compile(tekstWzorzec);
        Matcher dopasowanie= wzorzec.matcher(tekst);
        System.out.println(" Czy wyrażenie " + tekst + " ma format XX.XX.XXXX ? " + dopasowanie.matches());

    }

//8. Sprawdź, czy w tekście nie występuje biały znak (nie może wystąpić)

    static void bezBialychZnakow (String tekst) {
        System.out.print("Zad 8. Sprawdź, czy w tekście nie występuje biały znak (nie może wystąpić). ");
        //String tekstWzorzec="[\\s]+[\\w]*"; //wtedy tylko te, które się zaczynaja od bialego
        String tekstWzorzec="[\\w]*[\\s]+[\\w]*"; //wtedy tylko te, które się zaczynaja od bialego
        Pattern wzorzec=Pattern.compile(tekstWzorzec);
        Matcher dopasowanie= wzorzec.matcher(tekst);
        System.out.println("Czy w ciągu |" + tekst + "| wystapił bialy znak? " + dopasowanie.matches());
    }

    //9. Sprawdź, czy tekst jest numerem tablicy rejestracyjnej.
    static void czyTablicaRejestracyjna (String tekst) {
        System.out.print("Zad 9. Sprawdź, czy tekst jest numerem tablicy rejestracyjnej. "); //GD 266GE
        //https://pl.wikipedia.org/wiki/Tablice_rejestracyjne_w_Polsce
        //w nowych juz nie moze być od cyfry 0
        String tekstWzorzec1="[A-Z]{3}[ ][A-Z1-9]{1}[A-Z0-9]{3,4}";
        String tekstWzorzec2="[A-Z]{2}[ ][A-Z1-9]{1}[A-Z0-9]{4,5}";
        String tekstWzorzec4="[A-Z0-9]{2}[ ][A-Z0-9]{4}";
        String tekstWzorzec3="[A-Z]{1}[ ][A-Z1-9]{1}[A-Z0-9]{2}";
        //Cyfrą nie może być 0.
        Pattern wzorzec1=Pattern.compile(tekstWzorzec1);
        Pattern wzorzec2=Pattern.compile(tekstWzorzec2);
        Pattern wzorzec3=Pattern.compile(tekstWzorzec3);
        Pattern wzorzec4=Pattern.compile(tekstWzorzec4);
        Matcher dopasowanie1= wzorzec1.matcher(tekst);
        Matcher dopasowanie2= wzorzec2.matcher(tekst);
        Matcher dopasowanie3= wzorzec3.matcher(tekst);
        Matcher dopasowanie4= wzorzec4.matcher(tekst);
        boolean czyTablica=dopasowanie1.matches() || dopasowanie2.matches() || dopasowanie3.matches()||dopasowanie4.matches();
        System.out.println("czy ciąg znaków " + tekst + " może być tablicą rejestracyjną? " + czyTablica );

    }

//10. Sprawdź, czy łańcuch znaków to adres email.

    static void czyEmail (String tekst) {
        System.out.print("Zad 10. Sprawdź, czy łańcuch znaków to adres email. ");
        String tekstWzorzec="[\\w\\S]+[@]+[\\w]+[.\\w]+";
        Pattern wzorzec=Pattern.compile(tekstWzorzec);
        Matcher dopasowanie= wzorzec.matcher(tekst);
        System.out.println(" Czy "+ tekst + " może być adresem email? " + dopasowanie.matches());
    }

//-------------------
}
