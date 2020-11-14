package BlokiTematyczne.Petle;

public class PetlaForBezCiala {
    public static void main(String[] args) {

        int sum=0;

        for (int i=0;i<=5;sum=sum+i++);
        System.out.println(sum);

        for (int i=0;i<=5;sum+=i++);
        System.out.println(sum);

    }
}
