package Z_20200926.pkg;

import javax.swing.plaf.metal.MetalBorders;

public class PorownanieStringow {

    public static void main(String[] args) {
    String ala = "Ala ma kota";
    String alaDWa = new String("Ala ma kota");
    String alaTrzy = "Ala ma kota";
        System.out.println(ala == alaDWa);
        System.out.println(ala == alaTrzy);
        System.out.println("A teraz metoda equals(): ");
        System.out.println(ala.equals(alaDWa));
        System.out.println(ala.equals(alaTrzy));
}}
