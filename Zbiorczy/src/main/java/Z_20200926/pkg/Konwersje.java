package Z_20200926.pkg;

public class Konwersje {
    public static void main(String[] args) {
        byte sto=100;
        short stoShort=sto; //konwersja z byte na short
        //z mniejszego na wiekszy

        //z wiekszego na mniejszy

        short tysiac=1000;
        byte tysiacbyte=(byte)tysiac;

        System.out.println("tysiacbyte " + tysiacbyte + "tysiac " + tysiac); //po przekroczeniu max porzechodzi w minut
        //!utrata danych


        short tys2=1000;
        byte tysiacByte2=(byte)(tys2+2); //bez nawiasów wejdzie w konflikt typow

        System.out.println("Zadanie konwersje");
        System.out.println("A short na int");
        short Short1=2;
        int ShortNaInt=Short1;
        System.out.println(ShortNaInt);

        System.out.println("B short na long");
        long ShortNaLong=Short1;
        System.out.println(ShortNaLong);

        System.out.println("C int na float");
        int Int1=2;
        float IntNaFloat=Int1;
        System.out.println(IntNaFloat);

        System.out.println("D int na double");
        double IntNaDouble=Int1;
        System.out.println(IntNaDouble);

        System.out.println("E long na int");
        long log=2;
        int LogNaInt=(int)log;
        System.out.println(LogNaInt);

        System.out.println("F short na byte");
        byte byte2=(byte)Short1;
        System.out.println(byte2);

        System.out.println("G char na int");
        char ch='c';
        int CharNaInt=ch;
        System.out.println(CharNaInt); //asci

    }
}

