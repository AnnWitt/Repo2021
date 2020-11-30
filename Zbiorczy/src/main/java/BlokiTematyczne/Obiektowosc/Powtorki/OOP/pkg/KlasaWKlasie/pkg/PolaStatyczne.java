package BlokiTematyczne.Obiektowosc.Powtorki.OOP.pkg.KlasaWKlasie.pkg;

public class PolaStatyczne {
    public int myNumber = 18;                // zwykłe pole publiczne, wymaga instancji klasy
    public static int myStaticNumber = 21;   // pole statyczne klasy, NIE wymaga instancji klasy
    //Pole statyczne myStaticNumber będzie istniało nawet, jeśli nie stworzymy żadnej instancji.
    //Static : jedno pole dla wszystkich obiektórw w relacji 1 : n
    //bez Static : kazdy obiekt ma własny tylko dla niegp (1:1). Nie wychodzi poza swój obiekt

}
