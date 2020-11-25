package BlokiTematyczne.Obiektowosc.Powtorki.OOP.pkg.KlasaWKlasie.pkg;

public class MyOuterClass {

    private int outerNumber = 5;

    public class MyInnerClass {
        public void printNumber() {
            System.out.println(outerNumber+10);
        }
    }
    public MyInnerClass init() {
        return new MyInnerClass();  // = this.new MyInnerClass()
    }
}

