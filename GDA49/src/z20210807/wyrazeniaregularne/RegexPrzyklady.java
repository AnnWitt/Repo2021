package z20210807.wyrazeniaregularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPrzyklady {

    public static void main(String[] args) {
        String regex = "a{3}bc"; //a ma wystapic 3 razy, b 1
        //String regex2="a[1,5]bc"; //a ma wystapic 1-5 a
        Pattern pattern = Pattern.compile(regex);
        System.out.println("true");
        Matcher matcher = pattern.matcher("aaabc");
        System.out.println(matcher.matches());
        System.out.println("false");

        System.out.println("Czy tylko numery");
        RegexMetody.czyTylkoNumery("2222");
    }
}
//1. Sprawdź, czy tekst składa się z samych cyfr.


//2. Sprawdź, czy tekst składa się wyłącznie z małych znaków angielskiego alfabetu.



