package z20210821.cwiczeniaklas;

import static java.lang.Math.PI;

public class Circle {

    private static float r;

    public Circle(int r) {
        this.r=r;
    }

    void getArea () {
        System.out.println("pole koła: " + PI*(Math.pow(getR(),2)));
    }

    void getObw (){
        System.out.println("obwod koła: " + PI*2*getR());
    }

    //--------------------
    public static float getR() {
        return r;
    }

    public static void setR(float r) {
        Circle.r = r;
    }
}
