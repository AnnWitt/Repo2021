package BlokiTematyczne.Metody;

public class ZadanieSPlit {

    public static void main(String[] args) {

        //kilka napisow, rozdzielonych spacja i wypisac ile slow w zdaniu
        String zdanie = "aaa bbb ccc";

        String[] arrOfStr = zdanie.split(" ");
        System.out.println("Liczba " + arrOfStr.length);

        for (String a : arrOfStr)
            System.out.println(a);
        //sprobuj inna petla

    }
}
