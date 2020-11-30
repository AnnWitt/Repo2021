package BlokiTematyczne.tablice;

class TabliceDwuwymZadania {
    public static void main(String[] args) {
        int Liczba = 5;

        System.out.println("uzupelnienie calej tablicy 4 i 5");
        int[][] wywTbl = tablicaKwadratowa5(Liczba);
        for (int i = 0; i < Liczba; i++) {
            for (int j = 0; j < Liczba; j++) {
                System.out.print(wywTbl[i][j] + " ");
            }
            System.out.println();
        }

        //int Liczba2=1;
        int[][] wywTbl2 = tablicaKwPrzek1(Liczba);
        System.out.println("Przekatna 1 ");
        for (int i = 0; i < (Liczba); i++) {
            for (int j = 0; j < (Liczba); j++) {
                System.out.print(wywTbl2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] wywTbl3 = tablicaKwPrzek2(Liczba);
        System.out.println("Przekatna 2 ");
        for (int i = 0; i < (Liczba); i++) {
            for (int j = 0; j < (Liczba); j++) {
                System.out.print(wywTbl3[i][j] + " ");
            }
            System.out.println();
        }

        wywTbl3 = tabl3liczby(3, 6, 8);
        System.out.println("rzad liczb ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(wywTbl3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("vartbl");
        wywTbl3 = varTbl(3, 6, 8, 4, 7);
        int dl = wywTbl3.length;
        System.out.println("rzad liczb ");
        for (int i = 0; i < dl; i++) {
            for (int j = 0; j < dl; j++) {
                System.out.print(wywTbl3[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int[][] tablicaKwadratowa5(int Liczba) {
        int[][] mTbl = new int[Liczba][Liczba];
        for (int i = 0; i < Liczba; i++) {
            for (int j = 0; j < Liczba; j++) {
                if (j == 0) {
                    mTbl[i][j] = (Liczba - 1); //aby w 1 kolumnie byla inna liczba
                } else {
                    mTbl[i][j] = Liczba;
                }
            }
        }
        return mTbl;
    }

    public static int[][] tablicaKwPrzek1(int Liczba) {

        int[][] mTbl2 = new int[Liczba][Liczba];

        for (int i = 0; i < (Liczba); i++) {
            for (int j = 0; j < (Liczba); j++) {
                if (i == j) {
                    mTbl2[i][j] = 1;
                }
            }

        }
        return mTbl2;
    }

    //druga przekatna

    public static int[][] tablicaKwPrzek2(int Liczba) {

        int[][] mTbl3 = new int[Liczba][Liczba];

        for (int i = 0; i < (Liczba); i++) {
            for (int j = 0; j < (Liczba); j++) {
                if (i + j == (Liczba - 1)) {
                    mTbl3[i][j] = 1;
                }
            }
        }
        return mTbl3;
    }

    public static int[][] tabl3liczby(int l1, int l2, int l3) {


        int[] liczbytb = new int[]{l1, l2, l3};
        int dl = liczbytb.length;
        int[][] Tabl4 = new int[dl][dl];

        for (int i = 0; i < dl; i++) {
            for (int k = 0; k < dl; k++) {
                Tabl4[k][i] = liczbytb[k];
            }
        }

        return Tabl4;
    }
    //int arg0, int...args  --varargs


    public static int[][] varTbl(int... ostatni) {

        //int[] liczbytb=new int[]{varargs};
        int[] liczbytb = ostatni;

        //dl=ostatni.length;
        int[][] Tabl4 = new int[ostatni.length][ostatni.length];

        for (int i = 0; i < ostatni.length; i++) {
            for (int k = 0; k < ostatni.length; k++) {
                Tabl4[k][i] = liczbytb[k];
            }
        }

        return Tabl4;
    }

}
