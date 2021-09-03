package z20210807.wyrazeniaregularne.Zadania;

public class RegTest {

    static void testCzyNumery () {
        RegSRC.czyNumery("123");
        RegSRC.czyNumery("1d23");
    }

    static void testCzyMaleZnakiAng () {
        RegSRC.czyMaleZnakiAng("dtn");
        RegSRC.czyMaleZnakiAng("dtDn");
        RegSRC.czyMaleZnakiAng("dt2n");
    }

    static void testLancuchWyrazenie1 (){
        RegSRC.lancuchWyrazenie1("22aa");
        RegSRC.lancuchWyrazenie1("a4a");
        RegSRC.lancuchWyrazenie1("22ad");
        RegSRC.lancuchWyrazenie1("223");
    }

    static void testLancuchWyrazenie2 () {
        //regularnego 5?1?a+ ---> ? <0,1> /// + <1+)
        RegSRC.lancuchWyrazenie2("5"); //false bo musi być a
        RegSRC.lancuchWyrazenie2("51ddd"); //false bo musi być a
        RegSRC.lancuchWyrazenie2("55222"); //false bo brak a i za duzo 5
        RegSRC.lancuchWyrazenie2("51aa"); //true - 51 ok i ponad 1 a
        RegSRC.lancuchWyrazenie2("51a"); //true
        RegSRC.lancuchWyrazenie2("a"); //ok, liczb ne musi byc
        RegSRC.lancuchWyrazenie2("5a"); //ok nie musi byc 1
        RegSRC.lancuchWyrazenie2("aaaa");
        RegSRC.lancuchWyrazenie2("15aaaa"); //false bo kolejnosc liczb
        RegSRC.lancuchWyrazenie2("1aaaa"); //ok
    }


    static void testAlfaNumBiale() {
        RegSRC.alfaNumBiale("5");
        RegSRC.alfaNumBiale("51ddd");
        RegSRC.alfaNumBiale("A d23");
        RegSRC.alfaNumBiale("2 5");
        RegSRC.alfaNumBiale(" vd4");
        RegSRC.alfaNumBiale("A");
        RegSRC.alfaNumBiale(" a");
        RegSRC.alfaNumBiale("    ");
        RegSRC.alfaNumBiale("dddd    ");
        RegSRC.alfaNumBiale("Dffff");
        RegSRC.alfaNumBiale("dddfff");
        RegSRC.alfaNumBiale("ddd5fff");
        RegSRC.alfaNumBiale("ddd5%fff");
    }

    static void testCzyCyfraWtekscie () {
        System.out.println("\\D+ tj jakikolwiek znak, który nie jest cyfrą [^0-9],");
        RegSRC.czyCyfraWtekscie("dddd");
        RegSRC.czyCyfraWtekscie("DD");
        RegSRC.czyCyfraWtekscie("4dddd");
        RegSRC.czyCyfraWtekscie("d44ddd");
        RegSRC.czyCyfraWtekscie("dddd4");
        RegSRC.czyCyfraWtekscie("dd dd4");
        RegSRC.czyCyfraWtekscie("4");
        RegSRC.czyCyfraWtekscie("   4");
        RegSRC.czyCyfraWtekscie("4   ");
        RegSRC.czyCyfraWtekscie("4222");
        RegSRC.czyCyfraWtekscie("%4");
        RegSRC.czyCyfraWtekscie("%");
    }

    static void testFormatxxXXxxxx() {
        RegSRC.czyFormatxxXXxxxx("22.33.3333");
        RegSRC.czyFormatxxXXxxxx("222.33.3333");
        RegSRC.czyFormatxxXXxxxx("22.d3.3333");
        RegSRC.czyFormatxxXXxxxx("22.d3x3333");
    }

    static void testCzyBialeZnaki () {
        RegSRC.bezBialychZnakow("ddd");
        RegSRC.bezBialychZnakow("4");
        RegSRC.bezBialychZnakow("4dd");
        RegSRC.bezBialychZnakow(" dd");
        RegSRC.bezBialychZnakow("d d");
        RegSRC.bezBialychZnakow("dd ");
        RegSRC.bezBialychZnakow("     ");
    }

    static void testCzyTablicaRejestracyjna () {
        RegSRC.czyTablicaRejestracyjna("DD");
        RegSRC.czyTablicaRejestracyjna("GD 266GE");
        RegSRC.czyTablicaRejestracyjna("222222");
        RegSRC.czyTablicaRejestracyjna("GD 33333");
        RegSRC.czyTablicaRejestracyjna("XY 1A234");
        RegSRC.czyTablicaRejestracyjna("XY 1AC23");
        RegSRC.czyTablicaRejestracyjna("XY 1A023");
        RegSRC.czyTablicaRejestracyjna("WA 6642E");
        RegSRC.czyTablicaRejestracyjna("WI 027HJ");
        RegSRC.czyTablicaRejestracyjna("XYZ A123");
        RegSRC.czyTablicaRejestracyjna("D%D");
        RegSRC.czyTablicaRejestracyjna("dD");
        RegSRC.czyTablicaRejestracyjna("X AC1");
        RegSRC.czyTablicaRejestracyjna("dD");
        RegSRC.czyTablicaRejestracyjna("X A12");
        RegSRC.czyTablicaRejestracyjna("X 01C");
        RegSRC.czyTablicaRejestracyjna("F2 3313");
    }

    static void testCzyEmail() {
        RegSRC.czyEmail("annwitt@tlen.pl");
        RegSRC.czyEmail("ann444witt@tlen.pl");
        RegSRC.czyEmail("4@tlen.pl");
        RegSRC.czyEmail("an witt@tlen.pl");
        RegSRC.czyEmail("ann.witt@tlen.pl");
        RegSRC.czyEmail("ann_witt@tlen.pl");
        RegSRC.czyEmail("ann%witt@tlen.pl");
        RegSRC.czyEmail("annwitt@zapytajomnieikropke"); // ??????
        RegSRC.czyEmail("rayne@rayne.webd.pl");
        RegSRC.czyEmail("rayne@rayne..webd.pl");
    }

}
