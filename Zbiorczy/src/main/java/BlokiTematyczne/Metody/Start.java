package BlokiTematyczne.Metody;

public class Start {

    public static void main(String[] args) {

        //String - zmienna typu obiektowego, mozna wykonywac na nich metody. metoda=funkcja w obiektowych

        String imie = "xxx";
        int length = imie.length();//typu int ctrl alt v i od razu pod deklaracje
        String nazwisko = "nazwisko";
        //na stirngu mozna wywolac metode
        "dowolnystring".length();
        int length1 = "dowolnystring".length();
        System.out.println(nazwisko.indexOf("w"));

        //String jest niezmienny
        String imie2="xxx";
        imie2 +="cokolwiek"; //powstanie nowy string w nowym miejscu w pamieci

        int tt=10;
        tt+=3; //nadpisanie tego samego miejsca w pamieci
        //Stringi sa pamieciozerne, unikac w petli w miare mozliwosci

        //StringBuiler - Stringi ale bez problemow z wydajnoscia, nie jest nienadpisalny

        StringBuilder StrBuild=new StringBuilder("Julian");
        String StrBuild_zmienna = StrBuild.toString(); //powstanie stringa
        StrBuild.append(10); //dzobacz co to
        System.out.println("Str " + StrBuild_zmienna);

    }
}

