package Z_20200926.pkg;

class testujemy2 {
    public static void main(String[] args) {
        int liczba = 10;
        int kopia = liczba;

        System.out.println(++liczba);
        System.out.println(liczba++);

        liczba++;
        liczba++;
        System.out.println(liczba);
        System.out.println(kopia);

        System.out.println("a");
        int a = 10;
        System.out.println(a);

        a = a + 5;
        System.out.println(a);
        a = 10;
        System.out.println(a);
        a += 5;
        System.out.println(a);

        boolean spr = liczba == kopia;
    }
}
