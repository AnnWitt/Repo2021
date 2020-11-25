package BlokiTematyczne.Obiektowosc.Powtorki;

public class Zaczyty {
    public static String PString2() { //odpowiednik np nextint()
        String StringZKlasyZaczyty = "Zaczytroz nychtwyrazowtchc etdzielicpot";
        return StringZKlasyZaczyty;
    }


    public static int TblVarargs(int t0, int... tn) {
        int tZwrot = t0;
        System.out.println("wyswietlam kolejne elementy tablicy ");
        System.out.println();
        for (int i = 0; i < tn.length; i++) {
            System.out.println((i + 1) + " Argument zmienny " + tn[i] * 10);
        }
        return tZwrot;
    }


    public static void TblVarargs_void(int t0, int... tn) {
        int tZwrot = t0;
        System.out.println("wyswietlam kolejne elementy tablicy ");
        System.out.println();
        for (int i = 0; i < tn.length; i++) {
            System.out.println((i + 1) + " Argument zmienny " + tn[i] * 10);
        }
    }



}


// kontruktor

