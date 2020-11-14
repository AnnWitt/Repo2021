package Zadania.Zestaw_09_String_Wyrazenia_Regularne.pkg.Zestaw09_Zadanie12;

/*Rekurencja jest to sytuacja, w której funkcja (czy też w naszym przypadku metoda) wywołuje samą siebie
        w celu rozwiązania pewnego problemu - stąd m.in. słynne już powiedzenie żeby zrozumieć rekurencję,
        trzeba zrozumieć rekurencję.*/


public class Z09Z12Rekurencja {

    public String Odwrocenie (String s){
        String[] tblOdw = s.split("");
        for (int i = (tblOdw.length) - 1; i >= 0; i--) {
            System.out.print(tblOdw[i]);
        }
        return "";
    }

    public static void Odwrocenie2 (String s){
        String[] tblOdw = s.split("");
        for (int i = (tblOdw.length) - 1; i >= 0; i--) {
            System.out.print(tblOdw[i]);
        }
    }

    ///////////// Rekurencja - wywoladnie samej siebie. MAin moglby być w osobnej klasie ale jest w tej i wywoluje powyższe metody
    //sięga do tych dwóch powyżej
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
