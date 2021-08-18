package z20210807;

public class Zadanie1 {

    //   Zadanie nr 1. Zadeklaruj zmienną typu tekstowego - przypisz jej wartość tekstową (na
    //   który składa się co najmniej 5 znaków). Wypisz w konsoli kolejno:
    //        - wartość jego 4 znaku
    //               - indeks jego ostatniego znaku.

        private static String text="jakis daddastring";


        public static void processText() {
            // - jego długość
            System.out.println("Tekst składa się z " + text.length() + " liter");
            //       - wartość jego pierwszego znaku
            System.out.println("Pierwszy znak to: "+ text.charAt(0));
            //        - wartość jego 4 znaku
            System.out.println("Czwarty znak to: "+ text.charAt(4));
            System.out.println("\"" + "drugi cidzyslow \"" ); //cudzyslowia
            //               - indeks jego ostatniego znaku.
            System.out.println("ostatni znak to: "+ text.charAt(text.length()-1));
            String szukanaFraza="str";
            boolean wynikSzukaniaFrazy= czyTekstZawieraFraze(szukanaFraza);
            System.out.println("czy zawiera fraze " + szukanaFraza + " : " + wynikSzukaniaFrazy);

//        2. Wypisz wszystkie litery angielskiego alfabetu - (podpowiedź: użyj pętli z licznikiem
//        typu char - pamiętaj, że znaki to liczby! Jako wartość początkową użyj pierwszej litery
//        alfabetu, a w warunku kontynuacji pętli użyj ostatniej litery alfebetu)

            //for (char lit='a';'z';lit++) {

            //}

        }
//-------------------- metody
    public static void main(String[] args) {
        processText();
    }


    private static boolean czyTekstZawieraFraze (String fraza) {
            return text.contains(fraza); //contains sprawdza czy jest szukana fraza
    }


//---------metody


}

