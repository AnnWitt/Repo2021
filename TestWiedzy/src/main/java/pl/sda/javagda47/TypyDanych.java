package pl.sda.javagda47;

public class TypyDanych {
    public static void main(String[] args) {
        String Str="Tekst";
        char cr='c';
        //System.out.println(cr);
        int liczba=5;
        int ctest=cr;
        //System.out.println(ctest);
        liczba=3;
        liczba=liczba +5;

        System.out.println(liczba +" "+cr+" "+Str);
        System.out.println("Kod ASCII litery " +cr + " to "+ctest);
    }
}
class ZadanieCzwarte {
    public static void main(String[] args) {
        String a="aaa",b="bbb",c="ccc";
        //1
        a="b";
        b="c";
        c="a";

        System.out.println("a="+ a+ " b=" +b+ " c=" +c);

    }
}

class Zadanie5Log {
    public static void main(String[] args) { //domyslną wartosia jest false !!!!
        //boolean m; i boolean m=false to to samo
    boolean jestCieplo=true;
    boolean wiejeWiatr=true;
    boolean swieciSlonce=false;

    boolean ubieram_sie_cieplo;
    boolean biore_parasol;
    boolean swieci_slonce;




    //'boolean spr=liczba==kopia;'

        System.out.println("czy swieci słonce " + swieciSlonce); //ciekawostka - bez tego mi sie false dla tej zmiennej wyszarzał
        System.out.println("czy wieje " +wiejeWiatr);
        System.out.println("czy cieplo " +jestCieplo);

    //pomocnicze abym pamietała
//        boolean xxx=jestCieplo || wiejeWiatr; //zakłada że jedno z nich true

        //ubieram_sie_cieplo - jesli nie jest cieplo lub wieje wiatr
        System.out.println("ubieram sie cieplo " + (jestCieplo=false));

        //biore_parasol - jesli nie swieci slonce ale nie wieje wiatr
        System.out.println("biorę parasol "); //biore parasol

        System.out.println("swieci slonce " + (swieciSlonce=true)); //czy swieci slonce= false

        //boolean wiatr_bez_slonca=((swieciSlonce)  && wiejeWiatr); //czy swieciSlonce true ->nie && czy wieje wiatr - tak => prawda && fałsz = fałsz
        boolean wiatr_bez_slonca=(swieciSlonce=false);

        System.out.println("wiatr i bez slonca ");
        //ubieram_kurtke - jesli wieje, nie ma slonca i nie jest cieplo
        System.out.println("ubieram kurtkę " + ((jestCieplo =false) && (wiatr_bez_slonca=false))); //ubieram Kurtke
    }
}

class Zadanie5Log3 {
    public static void main(String[] args) {
        boolean jest_cieplo = false;
        boolean wieje_wiatr = true;
        boolean swieci_slonce = false;

        boolean ubieram_sie_cieplo;
        boolean biore_parasol;
        boolean ubieram_kurtke;

        System.out.println("Czy ciepło: " + jest_cieplo);
        System.out.println("czy wiatr: " + wieje_wiatr);
        System.out.println("czy swieci słonce: " + swieci_slonce);

        //ubieram_sie_cieplo - jesli nie jest cieplo lub wieje wiatr
        ubieram_sie_cieplo=(jest_cieplo==false)||(wieje_wiatr==true); // true||true
        ubieram_sie_cieplo=(!jest_cieplo)||(wieje_wiatr); // true||true
        //tożsame z



        System.out.println("ubieram się cieplo: " + ubieram_sie_cieplo); //true

        //jest cieplo== false i czywieje true - sprawdza najpierw pierwszy dopiero pozniej drugi, przechodzi dalej
        //jezeli pierwsze jest prawdziwe, dopiero potem drugie
        ubieram_sie_cieplo=(jest_cieplo==false||wieje_wiatr==false);//poprawne


        //biore_parasol - jesli nie swieci slonce ale nie wieje wiatr
        biore_parasol=((swieci_slonce==false) && (wieje_wiatr==false)); //true&&false ->false
        System.out.println("biore parasol: " + biore_parasol); //ok
       biore_parasol=(!swieci_slonce&&wieje_wiatr);//poprawne

        //ubieram_kurtke - jesli wieje, nie ma slonca i nie jest cieplo
        //na raty bo tylko dwa warunki wchodzą
        boolean slonce_i_cieplo;

        ubieram_kurtke=(((wieje_wiatr==true) && (jest_cieplo==false)&& (swieci_slonce==false))); // mozna wiecej niż dwa
        ubieram_kurtke=(wieje_wiatr && !jest_cieplo && !swieci_slonce); // mozna wiecej niż dwa !zzz negacja = zzz==false
        System.out.println("ubieram kurtke: " + ubieram_kurtke);


//        true && true	true
//        true && false	false
//        false && true	false
//        false && false false

        boolean czywlaczony=true;
        System.out.println(czywlaczony==true);
        System.out.println(czywlaczony);//tożsame
        System.out.println(!czywlaczony); //czy jest = false wiec = false

//!!!!!!!!!!!!!!sprawdz w domu, pokombinuj
    }
}

//Zadania do zrobienia 4,5,9,10 11