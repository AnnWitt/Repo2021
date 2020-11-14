package BlokiTematyczne.Obiektowosc.P6Z4;

public class Punkt2D {

    int x1;
    int y1;
    int x2;
    int y2;

    public Punkt2D() {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public static int sumaTst(int getX1, int getY1, int getX2, int getY2) {
        int x1=getX1;
        int x2=getX2;
        int y1=getY1;
        int y2=getY2;
        int suma=x1+x2+y1+y2;
        return suma;
    }

    public static double dlugosc(int getX1, int getY1, int getX2, int getY2) {
        int x1=getX1;
        int y1=getY1;
        int x2=getX2;
        int y2=getY2;
        //int dl=Math.sqrt(Math.pow(x2-x1)+Math.pow(y2-y1));
        //int dl= (int) (Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        //int test= x1*x2*y1*y2;
        double test=  Math.sqrt((Math.pow(x2-x1,2) +Math.pow(y2-y1,2)));

        return test;
    }
}
