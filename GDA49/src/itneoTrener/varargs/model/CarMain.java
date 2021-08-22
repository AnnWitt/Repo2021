package itneoTrener.varargs.model;

import itneoTrener.klasy_zadania.Silnik;
import itneoTrener.varargs.VarArgsPrzyklady;

import java.util.Arrays;

public class CarMain {

    public static void main(String[] args) {
        Car car = Car.builder()
                .withMarka("BWM")
                .withModel("i420")
                .withKolor(Kolor.NIEBIESKI)
                .withTypSilnika(TypSilnika.DISIEL)
                .withSilnik(Silnik.builder()
                        .withMoc(330)
                        .withPojemnosc("3.0")
                        .build())
                .build();

        Car car2 = Car.builder()
                .withMarka("MERCEDES")
                .withModel("EQA")
                .withKolor(Kolor.NIEBIESKI)
                .withTypSilnika(TypSilnika.ELEKTRYCZNY)
                .withSilnik(Silnik.builder()
                        .withMoc(480)
                        .withPojemnosc("2.0")
                        .build())
                .build();

        Car car3 = Car.builder()
                .withMarka("MERCEDES")
                .withModel("GT")
                .withKolor(Kolor.CZARNY)
                .withTypSilnika(TypSilnika.HYBRYDA)
                .withSilnik(Silnik.builder()
                        .withMoc(550)
                        .withPojemnosc("5.0")
                        .build())
                .build();

        System.out.println("tablica cars2 filtruj dla niebieskiego car,car2,car3");
        Car[] cars1 = VarArgsPrzyklady.filtrujSamochodyDlaPodanegoKoloru(Kolor.NIEBIESKI, car, car2, car3);
        System.out.println(Arrays.toString(cars1));

        System.out.println("tablica cars1 : filtruj dla niebieskiego car,car2,car3");
        Car[] cars2 = VarArgsPrzyklady.filtrujSamochodyDlaPodanegoKoloru(Kolor.NIEBIESKI, car, car3);
        System.out.println(Arrays.toString(cars2));

        System.out.println("tablica cars3 : filtruj dla typu silnika diesel car,car2,car3");
        Car[] cars3 = VarArgsPrzyklady.filtrujSamochodyDlaPodanegoTypuSilnika(TypSilnika.DISIEL, car, car2, car3);
        System.out.println(Arrays.toString(cars3));
    }
}
