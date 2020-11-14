package Zadania.Zestaw01_Typy_Operatory;

class Zestaw01_Zadanie11 {
    public static void main(String[] args) {
        double dochod = 3000;
        double podatek;
        String xxx;
        if (dochod < 85528) {
            podatek = (0.18 * dochod) - 556.02;
            xxx = "ocpja 1";
        } else {
            podatek = 14839.02 + (0.32 * (dochod - 85528));
            xxx = "opcja2";
        }

        System.out.println(podatek + " " + xxx);
    }
}
