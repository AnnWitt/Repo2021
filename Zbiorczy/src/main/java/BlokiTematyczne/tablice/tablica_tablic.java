package BlokiTematyczne.tablice;

class tablica_tablic {
    public static void main(String[] args) {


        //pierwsza argumentem jest tablica intów, potem inte jako takie
        int[][] Tbl = new int[3][4];
        //odwolanie do elementu
        //tablica druga element trzeci
        System.out.println(Tbl[1][2]); //element
        System.out.println(Tbl[1]); //adres fizyczny
    }
}
