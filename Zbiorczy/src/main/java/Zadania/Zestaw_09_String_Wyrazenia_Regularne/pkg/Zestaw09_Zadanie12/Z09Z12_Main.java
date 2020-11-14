package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg.Zestaw09_Zadanie12;

public class Z09Z12_Main { //zbędny

    public static void main(String[] args) {
        String slowo = "Dowolny";
        System.out.println(slowo);
        System.out.println();
        System.out.println("public String Odwrocenie");
        Z09Z12Rekurencja rekurencja = new Z09Z12Rekurencja();
        //System.out.println(rekurencja.Odwrocenie(slowo));
        rekurencja.Odwrocenie(slowo);
        System.out.println();
        System.out.println();
        System.out.println("public static void Odwrocenie2");
        Z09Z12Rekurencja voidem=new Z09Z12Rekurencja();
        voidem.Odwrocenie2(slowo);
        System.out.println();


    }
}

