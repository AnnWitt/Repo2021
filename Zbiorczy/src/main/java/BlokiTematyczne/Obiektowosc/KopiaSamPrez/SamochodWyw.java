package BlokiTematyczne.Obiektowosc.KopiaSamPrez;


public class SamochodWyw {

    public static void main(String[] args) {

        SamochodKonstr KPusty=new SamochodKonstr();
        SamochodKonstr KMarka=new SamochodKonstr("seat");
        SamochodKonstr KWiek=new SamochodKonstr(2010);
       SamochodKonstr KKolorMarka=new SamochodKonstr("Seat","Czarny");
        SamochodKonstr KDupa=new SamochodKonstr("dd","ddd","dddddd");
        //ok czyli on łapie po ilosci elementów danego typu



        System.out.println(KPusty); //wyplul jakis tekst
        System.out.println("Proba z KMarka");
        System.out.println(KMarka.marka);
        System.out.println("proba z KolorMarka");
        System.out.println(KKolorMarka.kolor);

//wywolanie metody do obliczania wieku auta
        System.out.println("Samochod ma lat: " + SamochodKonstr.Ilelat(2010));

//Ok to teraz podejdzmy do getterów i setterow --> metody do pobierania lub zapiosywania wartosc
        //Enkapsulacja  danych -ukrywanie widoczności pól danej klasy dla innych klas.
   /*     Można się do nich dostać, ale tylko za pozwoleniem klasy, w której te pola się znajdują. Tak więc musi
        ona udostępniać publiczne metody, które umożliwią wykonanie operacji na jej polach.*/
/*        Warunki aby byla spelniona:|
        Pola klasy muszą być poprzedzone modyfikatorem private (wtedy są niewidoczne dla innych klas).
        W klasie muszą istnieć metody z modyfikatorem public, które umożliwią zmianę oraz odczyt wartości w polach (wtedy inne klasy mogą wykorzystać te metody*/
//np nie chcemy udostępniać pól jakiejs klasy  innym klasom w projekcie, ale chcemy umożliwić zmianę tych pól przez te klasy

        System.out.println("Rocznik gettertem z KWiek " + KWiek.getRocznik());
        System.out.println("wchodzimy z setterem");
        KWiek.setRocznik(2000);
        System.out.println("Rocznik gettertem z KWiek " + KWiek.getRocznik());
//zdaje sie ze to pomoze jesli w tej klasie z konsturktorami jest private
        System.out.println("proba na zmiennej, ktora ma atryvbut private ");
        System.out.println(KWiek.getLiczbaDrzwi());
        KWiek.setLiczbaDrzwi(10);
        System.out.println("Liczba drzwi po setterze");
        System.out.println(KWiek.getLiczbaDrzwi());
//ok czyli udalo mi sie dobrac do zmiennej private

    }

}
