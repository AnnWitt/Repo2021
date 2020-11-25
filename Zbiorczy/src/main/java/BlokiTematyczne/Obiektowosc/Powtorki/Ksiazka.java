package BlokiTematyczne.Obiektowosc.Powtorki;

import java.io.IOException;

public class Ksiazka {

    public static void main(String[] args) throws IOException {
int y=0;
        int x=10;
        System.out.println("x wynosi " +x);
        System.out.println("x++ wynosi " +(x++));
        System.out.println("x wynosi " +x);
        y=x++;
        System.out.println("y=x++ wynosi " +y);
        x=10;
        y=0;
        y=++x;
        System.out.println("x wynosi " +x);
        System.out.println("++x wynosi " +(++x));
        System.out.println("y=++x wynosi " +y);
        System.out.println("x wynosi " +x);



    }

}

class pomoc {
    public static void main(String[] args) {
        String x="4";
        InstrHelp(x); //void
    }

    public static void InstrHelp (String s) {
        switch (s) {
            case "1" :
                System.out.println("wybrano intrukcje 1a");
                System.out.println("wybrano intrukcje 1b");
                System.out.println("wybrano intrukcje 1c");
                System.out.println("wybrano intrukcje 1d");
                break;
            case "2" :
                System.out.println("wybrano intrukcje 2a");
                System.out.println("wybrano intrukcje 2b");
                System.out.println("wybrano intrukcje 2c");
                System.out.println("wybrano intrukcje 2d");
                break;
            case "3" :
                System.out.println("wybrano intrukcje 3a");
                System.out.println("wybrano intrukcje 3b");
                System.out.println("wybrano intrukcje 3c");
                System.out.println("wybrano intrukcje 3d");
                break;
            default :
                System.out.println("wybrano intrukcje xa");
                System.out.println("wybrano intrukcje xb");
                System.out.println("wybrano intrukcje xc");
                System.out.println("wybrano intrukcje xd");
                break;

        }

    }
}
