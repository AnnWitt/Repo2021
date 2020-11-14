package BlokiTematyczne.tablice;

class TabliceZad1 {
    public static void main(String[] args) {
        int[] t1 = new int[]{1, 3, 5, 10};
        System.out.println(t1[2] + " " + t1[1]);

        System.out.println("wypisanie w petli");

        for (int i = 0; i < t1.length; i++) { //jesli by było<= to by doszedl do elementu poza zakresem tablicy
            System.out.println(t1[i]);
        }

        //wypisac tylko parzyste indeksy
        System.out.println("tylko parzyte wg inteksu");
        for (int i = 0; i < t1.length; i++) { //mozna tez po prostu i+=2 i wyrzucac t1[i]
            if (i % 2 == 0) {
                System.out.println("pozycja" + i + " " + t1[i]);
            }
        }
//wypisac tylko parzyste

        System.out.println("tylko parzyte wartosci");
        for (int i = 0; i < t1.length; i++) { //mozna tez po prostu i+=2 i wyrzucac t1[i]
            if (t1[i] % 2 == 0) {
                System.out.println("wartosc " + t1[i]);
            }
        }

        //wypisac w odwroconej kolejnosci
        System.out.println("wypisac w odwroconej kolejnosc");
        for (int i = (t1.length - 1); i >= 0; i--) { //jesli by było<= to by doszedl do elementu poza zakresem tablicy
            System.out.println(t1[i]);
        }
    }
}
