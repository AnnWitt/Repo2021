package BlokiTematyczne.Obiektowosc.P6Z4;

import java.util.Scanner;

public class Punkt2DWyw {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Punkt2D pkt=new Punkt2D();

        System.out.println("Podaj x1");
        pkt.setX1(input.nextInt());
        System.out.println("Podaj y1");
        pkt.setY1(input.nextInt());
        System.out.println("Podaj x2");
        pkt.setX2(input.nextInt());
        System.out.println("Podaj y2");
        pkt.setY2(input.nextInt());


        System.out.println(pkt.getX1()+ " "+pkt.getY1()  + " "+ pkt.getX2() + " " +pkt.getY2());

        System.out.println(pkt.sumaTst(pkt.getX1(),pkt.getX2(),pkt.getY1(),pkt.getY2()));
        System.out.println(pkt.dlugosc(pkt.getX1(),pkt.getY1(),pkt.getX2(),pkt.getY2()));
    }

}
