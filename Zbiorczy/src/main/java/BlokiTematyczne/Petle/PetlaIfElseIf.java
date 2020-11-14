package BlokiTematyczne.Petle;

public class PetlaIfElseIf {

    public static void main(String[] args) {

        int x;
        for (x=0;x<6;x++) {
            if (x==1)
                System.out.println("x rowne 1");
            else if (x == 2)
                    System.out.println("x rowne 2");
                else if (x == 3)
                    System.out.println("x rowne 3");
                else if (x == 4)
                    System.out.println("x rowne 4");
             else {
                System.out.println("x nie nalezy do przedzialu 1 do 4");
            }
        }




    }

}
