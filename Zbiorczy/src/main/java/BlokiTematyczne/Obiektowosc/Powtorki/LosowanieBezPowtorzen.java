package BlokiTematyczne.Obiektowosc.Powtorki;
//import BlokiTematyczne.Obiektowosc.Powtorki.pkg.Powtorki;

import java.util.Random;
public class LosowanieBezPowtorzen {

    public static void main(String[] args) {
        Random los=new Random();
        int ileLiczb=10;
        int[] Tbl=new int[ileLiczb];
        for (int i =0;i<ileLiczb;i++){
            Tbl[i]=los.nextInt((14))+1;
            for (int j=1;j<=i;j++) {
                if (Tbl[i]!=Tbl[j-1] && Tbl[i]!=Tbl[0]) {
                } else {
                    Tbl[i]=los.nextInt((14))+1;
                    j=1;
                }
            }
            System.out.println(Tbl[i]);
        }
    }
}
