package BlokiTematyczne.Obiektowosc.Obiektowosc_zdn;

public class PracownikWyw {
    public static void main(String[] args) {
        //prezentavja nr 6

/*       1. Wykorzystując operator new utwórz kilka obiektów klasy Pracownik
        2.Podczas tworzenia obiektów wykorzystaj wszystkie dostępne w klasie
        konstruktory
        3.Sprawdź w jakiej kolejności należy podawać wartości w konstruktorze.*/

        PracownikKonstr p1 = new PracownikKonstr("Do_Imie");
        PracownikKonstr p2 = new PracownikKonstr("D_Imie", "D_Nazwisko");
        PracownikKonstr p3 = new PracownikKonstr("D_imie", "D_nazwisko", 35, "2010-04-04", 12423);

        System.out.println(p1.getImie());
        System.out.println(p2.getImie() + " " + p2.getNazwisko());
        System.out.println(p3.getImie() + " " + p3.getNazwisko() + " " + p3.getWiek() + " " + p3.getDataZatrudnienia() + " " + p3.getWynagrodzenie());

        System.out.println("Po zmianie");
        p1.setImie("test");
        p3.setWynagrodzenie(31534);
        System.out.println(p1.getImie());
        System.out.println(p2.getImie() + " " + p2.getNazwisko());
        System.out.println("pracownik nr "+ p3.setIloscPracownikow(p3.IloscPracownikow)+ " " +p3.getImie() + " " + p3.getNazwisko() + " " + p3.getWiek() + " " + p3.getDataZatrudnienia() + " " + p3.getWynagrodzenie()+ " ID " + p3.setID_Pracownika(p3.ID_Pracownika));

        System.out.println("Zadanie 7 slajd 25");

        System.out.println("powitanie z wywolania");
        PracownikKonstr powit = new PracownikKonstr("ddd");
        powit.Powitanie();//wywolanie z odniesieniem do tego co w nawiasie
        System.out.println("ID - settery");
        System.out.println("pracownik nr "+ p3.setIloscPracownikow(p3.IloscPracownikow)+ " " +p3.setImie("Nowe imie 1") + " " + p3.setNazwisko("nowe nazwisko1") + " " + p3.setWiek(45) + " " + p3.setDataZatrudnienia("2020-03-03") + " " + p3.setWynagrodzenie(3000)+" ID " +p3.setID_Pracownika(p3.ID_Pracownika ));
        System.out.println("pracownik nr "+ p3.setIloscPracownikow(p3.IloscPracownikow)+ " " +p3.setImie("Nowe imie 2") + " " + p3.setNazwisko("nowe nazwisko2") + " " + p3.setWiek(35) + " " + p3.setDataZatrudnienia("2020-01-03") + " " + p3.setWynagrodzenie(3300)+" ID " +p3.setID_Pracownika(p3.ID_Pracownika ));
        System.out.println("pracownik nr "+ p3.setIloscPracownikow(p3.IloscPracownikow)+ " " +p3.setImie("Nowe imie 3") + " " + p3.setNazwisko("nowe nazwisko3") + " " + p3.setWiek(45) + " " + p3.setDataZatrudnienia("2020-04-03") + " " + p3.setWynagrodzenie(3600)+" ID " +p3.setID_Pracownika(p3.ID_Pracownika ));
        System.out.println("pracownik nr "+ p3.setIloscPracownikow(p3.IloscPracownikow)+ " " +p3.setImie("Nowe imie 4") + " " + p3.setNazwisko("nowe nazwisko4") + " " + p3.setWiek(55) + " " + p3.setDataZatrudnienia("2020-03-03") + " " + p3.setWynagrodzenie(3100)+" ID " +p3.setID_Pracownika(p3.ID_Pracownika ));
        System.out.println("pracownik nr "+ p3.setIloscPracownikow(p3.IloscPracownikow)+ " " +p3.setImie("Nowe imie 5") + " " + p3.setNazwisko("nowe nazwisko5") + " " + p3.setWiek(25) + " " + p3.setDataZatrudnienia("2020-04-03") + " " + p3.setWynagrodzenie(2900)+" ID " +p3.setID_Pracownika(p3.ID_Pracownika ));

        //ID w zasadzie jest liczba pracownikow u mnie

        //zad 4 (slajd 16) i 5 zadanie domowe (slajd 18)

        //z tego ostatniego


    }
    //
}

