package z20210821;

public class klasa {

    public static void main(String[] args) {
      /*  SamochodKlasa nowySamochodKlasa =new SamochodKlasa(); //kazdy samochod jest obiektem i ma swoje metody ktore mozna wywolywac
        String colorPodstawowy= nowySamochodKlasa.getColor();
        System.out.println("kolor podstawowy " + colorPodstawowy);*/ //el1
        String nowyKolorSamochodu="czarny";
        //ab ustawić  kolor czarny
/*        nowySamochodKlasa.setColor(nowyKolorSamochodu);
        System.out.println("nowy kolor "+ nowySamochodKlasa.getColor());*/
        System.out.println("wyswietlSamochopPRV(nowySamochodKlasa, nowyKolorSamochodu);"); //do el1
        //wyswietlSamochopPRV(nowySamochodKlasa, nowyKolorSamochodu); el1
        wyswietlSamochopPRV(stworzSamochod("zielony"), "fioletowy");
        SamochodKlasa tesla=new SamochodKlasa(); //stwirzenue nowego samochodu
        tesla.setColor("Biały");
       // String nowykolortesli="niebieski";
        //wyswietlSamochopPRV(tesla, nowykolortesli);

        tesla.wyswietlPrzegieg();


    }

    private static void wyswietlSamochopPRV (SamochodKlasa samochododkolejny, String nowyKolor) {
        System.out.println("Podstawowy kolor samochodu t " + samochododkolejny.getColor());
        samochododkolejny.setColor(nowyKolor);
        System.out.println("nowy kolor samochodu to" + samochododkolejny.getColor());
    }

    private static SamochodKlasa stworzSamochod(String colorPodstawowy){
        SamochodKlasa samochod=new SamochodKlasa(); //nowy obiekt instancja klasy
        samochod.setColor(colorPodstawowy);
        return samochod;
    } //dzieki temu mozemy sie pozbyc "el1

}
