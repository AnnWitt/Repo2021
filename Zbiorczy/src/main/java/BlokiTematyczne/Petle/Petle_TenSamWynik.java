package BlokiTematyczne.Petle;

public class Petle_TenSamWynik {

    public static void main(String[] args) {
        System.out.print("Za pomocą pętli FOR -> ");

        for (int i=1;i<=10;i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.print("Za pomocą pętli WHILE -> ");

        int i=1;
        while (i<=10) {
            System.out.print(i + ", ");
            i++;
        }

        System.out.println();
        System.out.print("Za pomocą pętli Do WHILE -> ");

        i=1;
        do {
            System.out.print(i + ", ");
            i++;
        } while (i<=10);

        //for each



    }


}
