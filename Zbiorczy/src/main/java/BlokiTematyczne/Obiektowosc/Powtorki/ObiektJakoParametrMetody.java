package BlokiTematyczne.Obiektowosc.Powtorki;

public class ObiektJakoParametrMetody {

    public static void main(String[] args) {
        Block blok1 = new Block(1, 2, 3);
        Block blok2 = new Block(1, 2, 3);
        Block blok3 = new Block(1, 4, 3);

        System.out.println(blok1.sameBlock(blok2)); //pierwszy wywolal metodę po drugim
        System.out.println(blok1.sameBlock(blok3));


    }

    static class Block {
        int a, b, c;
        int volume;

        Block(int i, int j, int k) {
            a = i;
            b = j;
            c = k;
            volume = a * b * c;
        }

        boolean sameBlock(Block ob) { //ob nie ma znaczenia, to jak Scanner scan=new Scanner ....
            if ((ob.a == a) & (ob.b == b) & (ob.c == c)) {
                return true;
            } else {
                return false;
            }
        }
    }


}
