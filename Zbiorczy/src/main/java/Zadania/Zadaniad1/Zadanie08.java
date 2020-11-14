package Zadania.Zadaniad1;

public class Zadanie08 {
    public static void main(String[] args) {

        int[] tbl=new int[]{0,4,6,8};

        int roznica=Math.abs(tbl[0]-tbl[1]);
        int kontrolka=0;

        for (int i=1;i< tbl.length;i++) {
            if (Math.abs(tbl[i]-tbl[i-1])!=roznica) {
                kontrolka=kontrolka+1;
            }
        }

        if (kontrolka==0) {
            System.out.println("Ciąg arytmetyczny");
        } else {
            System.out.println("Ciąg nie jest arytmetyczny");
        }



    }
}
