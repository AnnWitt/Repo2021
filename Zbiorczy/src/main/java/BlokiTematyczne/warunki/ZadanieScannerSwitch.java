package BlokiTematyczne.warunki;

import java.util.Scanner;

class ZadanieScannerSwitch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scan.nextLine(); //po tym znak \n jest usuniety
        System.out.println("Podaj wiek");
        // int wiek = scan.nextInt();
        boolean czywiek = scan.hasNextInt(); //aby sprawdzal poprawnosc
        //jezeli KAsia albo Asia - to moje ulubione imie
        if (czywiek) {
            int wiek = scan.nextInt();
            scan.nextLine(); //aby pozbyc sie tego \n
            //po tym zostaje nieusuniety \n tj 15\, w momencie jak robimy nextline
            // po tym to zaczytuje sie enter tj pusty string

            switch (imie) {
                case "Kasia":
                    System.out.println("Cześć, wiem że masz na imię " + imie + " (to moje ulubone imię), i masz " + wiek + " lat");
                    break;
                case "Asia":
                    System.out.println("Cześć, wiem że masz na imię " + imie + " (to moje ulubone imię), i masz " + wiek + " lat");
                    break;
                default:
                    System.out.println("Cześć, wiem że masz na imię " + imie + " i masz " + wiek + " lat");
                    break;
            }
        } else {
            System.out.println("nie podano liczby");
        }


        int wiek = 10;
        switch (wiek) {
            case 10:
                System.out.println("Zostalo Ci 80 lat zycia");
                break;
            case 89:
                System.out.println("To Twoj ostatni rok");
                break;
    }
} }
