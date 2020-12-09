package BlokiTematyczne.Obiektowosc.Powtorki;

public class Any {
    public static void main(String[] args) {
        int i=10;
        Samochod p1=new Samochod("Audi",2000,"czarny");
        System.out.println(p1.getNazwa());
        metoda1(p1);
        System.out.println(p1.getNazwa());
    }
    public static void metoda1 (Samochod s) {
        s.setNazwa("Mazda");
        System.out.println(s.getNazwa());
    }
}
