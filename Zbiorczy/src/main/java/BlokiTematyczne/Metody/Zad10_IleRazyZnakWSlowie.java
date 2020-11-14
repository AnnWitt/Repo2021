package BlokiTematyczne.Metody;

class Zad10_IleRazyZnakWSlowie {
    public static void main(String[] args) {
        //10. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wyświetla
        //informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.

        String Tekst = "Dell";
        String[] Tablica = new String[Tekst.length()];

        for (int i = 0; i < (Tekst.length()); i++) {
            Tablica[i] = (String.valueOf(Tekst.charAt(i))).toLowerCase();
        }

        int licznik = 1;
        for (int i = 0; i < (Tekst.length() - 1); i++) {
            if (Tablica[i].equals(Tablica[Tekst.length() - 1])) { // uywaga - wywalal sie bo probowalam ==
                licznik = licznik + 1;
            }
        }
        System.out.println("Litera " + Tablica[Tekst.length() - 1] + " występuje w słowie " + Tekst + " " + licznik + " razy");
        //koniec
    }
}
