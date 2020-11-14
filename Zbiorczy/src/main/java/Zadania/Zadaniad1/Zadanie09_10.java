package Zadania.Zadaniad1;

public class Zadanie09_10 {
    public static void main(String[] args) {
        int dzielna=9;
        int dzielnik=6;

        int reszta= dzielna-((dzielna/dzielnik)*dzielnik);
        System.out.println(reszta);

        System.out.println("Czy modulo = mojemu rownaniu");

        System.out.println("rownanie = " + reszta + " z % "+ dzielna%dzielnik);

    }

}
