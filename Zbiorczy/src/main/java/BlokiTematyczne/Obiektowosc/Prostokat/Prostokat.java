package BlokiTematyczne.Obiektowosc.Prostokat;

public class Prostokat {
    public static void main(String[] args) {
        ProstokatKonstr p=new ProstokatKonstr(3,2,4,5); //okreslony prostokat
        System.out.println("pole" + p.poleProstokata() + " " + p.szerokosc);
        System.out.println("obwod " + p.obwProstokata());

        //lekka podpowiedz aby latwiej bylo zapamietac
        String imie="ddd";
        System.out.println(imie.toUpperCase());

        //proba wywolania kwadratu
        ProstokatKonstr kwadrat=new ProstokatKonstr((4));
        System.out.println(kwadrat.szerokosc + " pole = " + kwadrat.poleProstokata());
        System.out.println("obwod " + kwadrat.obwProstokata());
    }




}
// public(wszedzie)/private(tylko w obrebie metody danej klasy) modyfikatory dostepu - czy sa widoczne z
// zewnatrz tj nie w obrebie kodu
// np public int x; - jesli w konstruktorze to widoczne w main
//private int x - >  jesli w konstruktorze to  niewidoczne w main
//domyslny int x -> publiczne ale tlko dla klas w danym pakiecie
//protected int x -> (dowiemy sie po dziedziczeniu)

//static przy metodie np -> wspolne dla wszystkich ??
// np:

