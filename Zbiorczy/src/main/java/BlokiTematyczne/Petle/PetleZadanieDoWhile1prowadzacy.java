package BlokiTematyczne.Petle;
import java.util.Scanner;

public class PetleZadanieDoWhile1prowadzacy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaOdUzytkownika;
        do {
            liczbaOdUzytkownika = scanner.nextInt();
            if (liczbaOdUzytkownika > 0) {
                int liczbaMniejsza = liczbaOdUzytkownika;
                do {
                    liczbaMniejsza--;
                    System.out.println(liczbaMniejsza);
                } while (liczbaMniejsza > 0);
            }
        } while (liczbaOdUzytkownika > 0);
    }

}
