package BlokiTematyczne.Obiektowosc.Powtorki.Kolonia;

import java.util.Scanner;

public class KoloniaMain {

    public static void main(String[] args) {
        int wzrostStala = 170;
        KoloniaKlasy iza = new KoloniaKlasy("brazowe", 40, "zielone", wzrostStala);
        KoloniaKlasy kasia = new KoloniaKlasy("fioletowe", 30, "niebieskie", 168);
        KoloniaKlasy asia = new KoloniaKlasy("blond", 30, "niebieskie", 150);
        KoloniaKlasy dorota = new KoloniaKlasy("rude", 30, "brazowe", 173);
        //KoloniaKlasy goha=new KoloniaKlasy("blond",30,"niebieskie",179);

        System.out.println(KoloniaKlasy.RokUrodzenia(20));
        System.out.println("Iza urodziła się w roku " + KoloniaKlasy.RokUrodzenia(iza.getWiek()));
        System.out.print("Iza miała włosy " + iza.getKolorWlosow());
        iza.setKolorWlosow("rozowe");
        System.out.print(" a teraz ma " + iza.getKolorWlosow());
        System.out.println();
        System.out.println(" ma w tej chwili lat " + iza.getWiek());
        iza.setWiek(20);
        System.out.println("Za ile lat");

        Scanner scan=new Scanner(System.in);
        boolean valid;
        int zaIleLat= scan.nextInt();
        //KoloniaKlasy.lataWalidacja(zaIleLat);

        //wywolanie klasy walidującej poprawność danych
        while (KoloniaKlasy.lataWalidacja(zaIleLat)==false) {
            System.out.println("ponownie");
            zaIleLat=scan.nextInt();
        }

        //int zaIleLat = 7;
        System.out.println("Iza za " + zaIleLat + " będzie miała " + iza.WiekPrzyszly(zaIleLat) + " lat");
        System.out.println("Będzie wtedy rok " + iza.WiekMinus(iza.WiekPrzyszly(zaIleLat)) + " wzrost " + iza.getWzrost());

        System.out.println("getter costam " + iza.getCostam());

        XxxZew x = new XxxZew();
        int wiekpl = x.TestZew() + 10;
        System.out.println(wiekpl);
        System.out.println("zewnetrzna, wewnetrzna, metoda w wewnetrznej (stała) " + XxxZew.XxxWew.TestWew());
        System.out.println("zewnetrzna, wewnetrzna,metoda w wewnetrznej odnoszaca sie do zewnetrznej " + XxxZew.XxxWew.WewKorzystazZewn());

        System.out.println("static orzy zmiennej");
        System.out.println(KoloniaKlasy.ZeStatic); //zadziala bo statyczna
        //System.out.println(KoloniaKlasy.wiek); //nie zadziala bo niestatyczna


        System.out.println("zadanie Adama");
        //KoloniaKlasy.dupa(4);
        System.out.println("dupa 1 " + KoloniaKlasy.dupa(4));
        System.out.println("dupa 2 " + KoloniaKlasy.dupa2(4));

    }

}

class XxxZew {
    public static int TestZew() {
        KoloniaKlasy goha = new KoloniaKlasy("blond", 30, "niebieskie", 179);
        return goha.getWiek();
    }

    static class XxxWew {
        public static int TestWew() {
            return 20;
        }

        public static int WewKorzystazZewn(){
            int y=XxxZew.ZMetodaTestZew();
            return y*3;

        }


    }

    public static int ZMetodaTestZew() {
        int x=TestZew();
        return x+100;
    }

}
