package BlokiTematyczne.Obiektowosc.Powtorki.OOP.pkg.KlasaWKlasie.pkg;

public class StatycznaWewnetrzna {
    String ss="dupa wewnętrzna ";
    public static class MyInnerClassStatis { //statyczna klasa wewnetrzna

    }
/*
    W przeciwieństwie do klasy wewnętrznej, która nie jest statyczna, nie
    potrzebna jest tutaj instancja klasy zewnętrznej, aby utworzyć instancję statycznej
    klasy wewnętrznej. */

    public MyInnerClassStatis wyw() {
        System.out.println(ss + " statyczna dupa w wywie");
        return new MyInnerClassStatis();
    }


}
