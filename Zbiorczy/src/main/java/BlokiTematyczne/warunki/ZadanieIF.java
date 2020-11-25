package BlokiTematyczne.warunki;

class ZadanieIF {

    public static void main(String[] args) {
        System.out.print("czy 2>3 -> ");
        if (2 > 3) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.print("czy 4<5 -> ");
        if (4 < 5) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        //(2-2)==0

        System.out.print("czy (2-2)==0) -> ");
        if ((2 - 2) == 0) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.print("true -> ");
        if (true) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.print("9%2 -> ");
        if (9 % 2 == 0) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.print("9%3 -> ");
        if (9 % 3 == 0) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }


        //elseif

        int wiek;

//        if (wiek<15) {
//            System.out.println("za mlody");
//        } else {
//            if (wiek<=18) {
//                System.out.println("wejsc z opiekunem");
//            } else {
//                System.out.println("mozesz bez opiekuna");
//            }
//        }

//        if (wiek<15) {
//            System.out.println("wiek <15");
//        } else if (wiek>15 && wiek<18) { //wejdzie tu jezeli pierwszy falszywy
//            System.out.println("wez opiekuna");
//            else {
//                System.out.println(">18");
//            } //dwa warunki else do sprawdzenia
//        }
//if ...else if ...else if ...else

//        if (wiek<15) { //wiek<= obejmuje też 15
//            System.out.println("wiek <15");
//        } else if (wiek>15 && wiek<18) { //wejdzie tu jezeli pierwszy falszywy
//            System.out.println("wez opiekuna");
//            else if (wiek>99) {
//                System.out.println("za duzy wiek");
//            }
//            else {
//                System.out.println(">18");
//            } //dwa warunki else do sprawdzenia
//        }


        // if (warunek1
        //if warunek2

        //if (warunek 1, warunek2) -- szybsze niz powyzej bo jedna operacja (ale roznice nieduze)
        //jezeli 1 warunek nieprawdziwy to nie sprawdza dalej
        // if (wiek>18 && waga++<150) - zwiekszenie w ramach warunku

    }

    //ctrl shift poruszanie wieszem w gore w dol w obrebie klasy
}
