package z20210807.wyrazeniaregularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPrzyklady {

    public static void main(String[] args) {
        String regexZm = "a{3}bc"; //a ma wystapic 3 razy, b 1
        String regexZm2 = "\\dab{2}c";
        String regexZm3 = "\\d+"; //tylko liczbowe
        String kodyPocztowe ="\\d{2}d\\d{3}"; //22d222
        String regexZm4 ="\\da+b"; //
        String adres2 ="\\d+[a-zA-Z]\\/\\d+[a-zA-Z]"; // 30/32 ok 30/32b źle
        String adres ="\\d+\\/\\d+"; // 30/32 ok 30/32b źle
        String doFind ="f+[bcd]*"; // *zero lub wiecej wystapien
        //String regex2="a[1,5]bc"; //a ma wystapic 1-5 a
        Pattern pattern = Pattern.compile(regexZm);
        Pattern pattern2 = Pattern.compile(regexZm2);
        Pattern pattern3 = Pattern.compile(regexZm3);
        Pattern pattern4 = Pattern.compile(regexZm4);
        Pattern patternAdres = Pattern.compile(adres);
        Pattern patternAdres2 = Pattern.compile(adres2);
        Pattern podFind=Pattern.compile(doFind);
        Pattern podFind2=Pattern.compile("c");
        Pattern patternKody = Pattern.compile(kodyPocztowe);
        Matcher matcher = pattern.matcher("aaabc");
        System.out.println(matcher.matches());
        System.out.println("matches " + pattern.matcher("aaabc").matches());
        System.out.println("find " + matcher.find(5) + " ");
        System.out.println("matches2 kolejnosc zgodna " + pattern2.matcher("4abbc").matches());
        System.out.println("matches2 rozna kolejnosc " + pattern2.matcher("4babc").matches());
        //System.out.println("false");
        System.out.println("matches3 " + pattern3.matcher("33").matches());
        System.out.println("matches4 \"3aaaaaaab\" " + pattern4.matcher("3aaaaaaab").matches());
        System.out.println("matches4 false bo d dwucyfrowe " + pattern4.matcher("33aaa").matches()); //false bo d dwucyfrowe
        System.out.println("matches4 false bo d dwucyfrowe " + pattern4.matcher("33aaa").matches()); //false bo d dwucyfrowe
        System.out.println("kody pocztowe " + patternKody.matcher("40d440").matches());
        //System.out.println("matches4 find " + pattern4.matcher("33aaa").find()); //false bo d dwucyfrowe
        System.out.println("do finda narazie na matchses " + podFind.matcher("ffffffd").matches());
        System.out.println("do finda - find " + podFind.matcher("wwwwd").find(1));
        System.out.println("do finda - find - find 2 " + podFind2.matcher("wwwwc").find(1)); //znalazł jeden z elementów pasujacych
        String zmAdres="30/32";
        String zmAdres2="30b/32b";
        System.out.println("Adres " + zmAdres + " " + patternAdres.matcher(zmAdres).matches());
        System.out.println("Adres " + zmAdres2 + " " +patternAdres2.matcher(zmAdres2).matches());
        System.out.print("Czy tylko numery ");

       RegexMetody.czyTylkoNumery("22y22");

        System.out.print("Czy tylko numery ");
        RegexMetody.czyTylkoNumery("222");

        //test z *
        Pattern patternUwaga=Pattern.compile("uwa*ga");
        System.out.println("uwaga " + patternUwaga.matcher("uwaaaaaga").matches());


    }
}
//1. Sprawdź, czy tekst składa się z samych cyfr.


//2. Sprawdź, czy tekst składa się wyłącznie z małych znaków angielskiego alfabetu.



