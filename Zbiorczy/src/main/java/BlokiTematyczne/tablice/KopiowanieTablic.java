package BlokiTematyczne.tablice;

public class KopiowanieTablic {

    public static void main(String[] args) {

        System.out.println("oryginal/kopia za pomocą =");
        int[] tablicaOryginalna = {1, 2, 3, 4};
        int[] tablicaSkopiowana = tablicaOryginalna;
        System.out.println("Oryginalna, 4 element: " + tablicaOryginalna[3]); //ginalna, 4 element: 4
        System.out.println("Kopia, 4 element: " + tablicaSkopiowana[3]); //Kopia, 4 element: 4
        tablicaSkopiowana[3] = 10;
        System.out.println("Oryginalna, 4 element: " + tablicaOryginalna[3]); //Oryginalna, 4 element: 10
        System.out.println("Kopia, 4 element: " + tablicaSkopiowana[3]);
        tablicaOryginalna[2] = 100;
        System.out.println("Kopia, 3 element: " + tablicaSkopiowana[2]);
        System.out.println("Oryginalna, 3 element: " + tablicaOryginalna[2]);
        //powstaje referencja - zmiana w oryginalnej powoduje zmiane w kopii i vice wersa
        System.out.println();
        System.out.println("element po elemencie");
        int[] oryginal = {1, 2, 3, 4};
        int[] kopia = new int[oryginal.length];

        for (int i = 0; i < oryginal.length; i++) {
            kopia[i] = oryginal[i];
        }
        System.out.println("Oryginalna, 4 element: " + oryginal[3]);
        System.out.println("Kopia, 4 element: " + kopia[3]);
        kopia[3] = 10;
        System.out.println("Oryginalna, 4 element: " + oryginal[3]);
        System.out.println("Kopia, 4 element: " + kopia[3]);

        System.out.println();
        System.out.println("clone");

        int[] kopia2=oryginal.clone();
        System.out.println(kopia2[2]);//ok
        kopia2[2]=100;
        System.out.println("oryginal " + oryginal[2]);//ok
        System.out.println("kopia +100 " + kopia2[2]);//ok
    }
}
