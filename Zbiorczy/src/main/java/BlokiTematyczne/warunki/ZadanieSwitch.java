package BlokiTematyczne.warunki;

class ZadanieSwitch {
    public static void main(String[] args) {
//alternatywa dla wielokrotnie zagniezdzonych ifów (odpowiednik case)

        int zmienna = 3;
        switch (zmienna) { //w przypadku stringa wpisujemy w cudzyslowiach np "xxx"
            case 1: //jezeli zmienna ma wartosc 1
                //wykonac akcje dla 1 przypadku
                System.out.println("case1");
                break; //przerwanie bloku kodu, koniec dzialania, bez tego pojdzie dalej
            case 2:
                //wykonac akcje dla 2, nie wejdzie co kolejnego jesli prawdziwa
                System.out.println("case2");
                break;
            //inne
            default:
                System.out.println("case default");
                //wykonanie gdy w poprzednie nie weszlismy
                break;
        }
        //od wersji 7 mozna uzywac w switchu stirnga, jezeli podkresli imie wejsc w podpowiedz
        String imie = "xxx";
        switch (imie) {
            case "xxcx":
                System.out.println(imie);
                break;
            default:
                System.out.println("inny");
                break; //bez nich wyrzuci wszystkie mozliwe casy
        }

    }
}
