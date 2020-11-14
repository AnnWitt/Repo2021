package Zadania.Zadaniad2;

public class Zadanie01 {
    public static void main(String[] args) {

        System.out.println(DzienTygodnia("9"));

    }

    public static String DzienTygodnia(String nrDnia) {
        String dzien = null;
        switch (nrDnia) {
            case "1":
                dzien = "Poniedziałek";
                break;
            case "2":
                dzien = "Wtorek";
                break;
            case "3":
                dzien = "Sroda";
                break;
            case "4":
                dzien = "Czwartek";
                break;
            case "5":
                dzien = "Piatek";
                break;
            case "6":
                dzien = "Sobota";
                break;
            case "7":
                dzien = "Niedziela";
                break;
            default: dzien="Nieprawidłowy nr";
        }
        return dzien;
    }

}
