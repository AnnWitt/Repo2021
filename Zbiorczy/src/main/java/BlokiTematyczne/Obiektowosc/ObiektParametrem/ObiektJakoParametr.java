package BlokiTematyczne.Obiektowosc.ObiektParametrem;

public class ObiektJakoParametr {

    public static void main(String[] args) {

        Block bl=new Block(1,2,4);
        System.out.println("z konsturktora");
        System.out.println(bl.value);
        System.out.println("z metody");
        System.out.println(bl.value + " -> " + bl.test(bl.value));

    }

    static class Block {
        int a,b,c;
        int value;

        public Block(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            value=a*b*c;
        }

        public int test(int value) {
            int xxx=this.value + 10;
            //int xxx=value + 10; //to samo wyjdzie
            return xxx;
        }

    }

    //koniec klasy
}
