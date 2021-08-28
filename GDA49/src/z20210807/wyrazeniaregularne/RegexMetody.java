package z20210807.wyrazeniaregularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetody {

    public static void czyTylkoNumery (String tekst) {
        String regex="\\d*";
        //1. Sprawdź, czy tekst składa się z samych cyfr.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tekst);
        System.out.println(matcher.matches());
    }

    static void RegexZ2 (String tekst) {
        //2. Sprawdź, czy tekst składa się wyłącznie z małych znaków angielskiego alfabetu.


    }


}


