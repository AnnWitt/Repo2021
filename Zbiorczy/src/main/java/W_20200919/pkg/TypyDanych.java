package W_20200919.pkg;
import java.time.*;

public class TypyDanych {

    public static void main(String[] args) { //czyli moga byc stringi ale tez inne
        //void typ zwracany przez medotę main, mogloby byc np int/ double/ty obiektowy

        {
            String hello = "Hello"; //wersja skrócona poniższego
            String hello2 = new String("do");
            String puste = "     ";

            String tekst = ("Fragment tekstu do zabawy");

            System.out.println(hello);
            System.out.println(hello2);

            System.out.println("dlugosc tekstu " + tekst.length());
            System.out.println("substring " + tekst.substring(0, 5)); // pierwszy znak liczy się jako zero, reszte wywala
            System.out.println("substring " + tekst.substring(1, 5)); // pierwszy znak liczy się jako zero, reszte wywala

            System.out.println("gdzie jes do (pozycja w ciagu znaków) " + tekst.indexOf(hello2));
            System.out.println("iempsty gdy same spacje " + puste.isEmpty());
            System.out.println("isblank gdy same spacfje " + puste.isBlank());
            System.out.println(tekst.replace("zabawy", "psucia"));
            System.out.println("wyciecie bialych znakow przed i po " + tekst.trim());

            System.out.println("ValueOf(23) " + String.valueOf(23));

            System.out.println("ends with " + tekst.endsWith("zabawy"));
            System.out.println("ends with " + tekst.endsWith("wy"));
            System.out.println("ends with " + tekst.endsWith("xxx")); //true/false - nie musza byc cale slowa
        }

        {//Daty ->LocalDate,LocalTime, LocalDateTime
            //Konieczne zaimportowanie pakietu import java.time.*; (na samym poczatku)


            System.out.println("Local date "+ LocalDate.now());
            System.out.println("Local time "+ LocalTime.now());
            System.out.println("LocalDateTime "+ LocalDateTime.now());
            System.out.println(LocalDate.of(2020,06,13));
            System.out.println(LocalTime.MIDNIGHT);
        }

        {//Matematyczne
            System.out.println("max "+ Math.max(2,75)); //tylko dwa udzwignie, do tego uzylam collections max w wizytowce
            System.out.println("abs " + Math.abs(-2.3));

            System.out.println("zaokre góre  3,5 -> "+ Math.ceil(3.5));
            System.out.println("zaokre w dl  3,5 -> "+ Math.floor(3.5));
            System.out.println("pow "+Math.pow(2,3)); //potęgowanie 2 do potęgi 3
            System.out.println("losowa " + Math.random()); //pomiedzy 0 a 1

            // losowe liczby pomeidzy 1 a 3
            for (int i = 0; i < 30; i++) {
                int rand = (int)(1+Math.random() * 3) ; //+1 inaczej by sie łapało zero
                System.out.print(rand +" -> ");
            }
            System.out.println();

            System.out.println("pierwiastek " + Math.sqrt(60));
        }

        {//Typy złożone i proste

            int intvalue=3;//typ prosty
            System.out.println("Typ prosty " +intvalue);
            Integer integerobject=new Integer(intvalue); //typ złożony - na złożonych możemy wykonywać metody
            System.out.println("Typ Złożony " + integerobject);

           float floatValueFromInteger=integerobject.floatValue(); //wykona się bo mamy typ złozony
            System.out.println(floatValueFromInteger);
            //float floatValueFromInt=intvalue.floatValue();  to się nie wykona bo mamy typ prosty


        }

}



}
