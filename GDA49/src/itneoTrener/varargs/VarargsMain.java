package itneoTrener.varargs;

import itneoTrener.varargs.model.TypSilnika;
import java.util.Arrays;

public class VarargsMain {

    public static void main(String[] args) {
        System.out.println("Suma dla 1,2,3,4 wynosi: " + VarArgsPrzyklady.suma(1,2,3,4));
        System.out.println("Suma dla 2,5 wynosi: " + VarArgsPrzyklady.suma(2,5));
        VarArgsPrzyklady.wypiszImiona("Piotr", "Jerzy");
        System.out.println("Nastepne wywołanie metody wypisz imiona.");
        VarArgsPrzyklady.wypiszImiona("Adam", "Piotr", "Sylwia", "Tadeusz");
        System.out.println(TypSilnika.ELEKTRYCZNY.getDescription());
        String tekst = "ALA MA ALA. SLON MA KOTA. Kasia nie lubi?";
        System.out.println(Arrays.toString(VarArgsPrzyklady.unikatoweSłowa(tekst.split("[. ?]"))));
        System.out.println(Arrays.toString(VarArgsPrzyklady.unikatoweSłowa("ALA", "MA", "KOTA", "MA", "SLON", "ALA")));

        System.out.println("Cenzurka");
        String text="Jakis tam tekst. Trump nie lubi Chinczyków. Kasia nie lubi Wojtka";
        //System.out.println(VarArgsPrzyklady.

    }


}
