package Z_20200926.pkg;

//ctrl alt l wyrownanie
class Zad3_na_spokojnie {
    public static void main(String[] args) {

        int a = 2 + 3;
        System.out.println("a= " + a);
        int b = 2 - 4;
        System.out.println("b= " + b);
        float c = 5 / 2f;
        System.out.println("c= " + c);
        float d = (5.0f / 2);
        System.out.println("d= " + d);
        float e = (5 / 2.0f);
        System.out.println("e= " + e);
        float f = (5.0f / 2.0f);
        System.out.println("f= " + f);
        long g = 100L - 10;
        System.out.println("g= " + g);
        float h = 2f - 3;
        System.out.println("h= " + h);
        float i = 5f / 2;
        System.out.println("i= " + i);
        double j = 5d / 2;
        System.out.println("j= " + j);
        int k = 'A' + 2;
        System.out.println("k= " + k); //ascii - wynik C w char
        int l = 'a' + 2;
        System.out.println("l= " + l);
        int m = a + 2;
        System.out.println("m= " + m);
        int n = a + b;
        System.out.println("n= " + n);
        int o = 'a' + 'b';
        System.out.println("o= " + o);
        int p = a + 'b';
        System.out.println("p= " + p);
        int q = a + 'b' + 3;
        System.out.println("q= " + q);
        int r = 'b' + 3 + a;
        System.out.println("r= " + r);

        int dzielna = 20;
        int dzielnik = 7;

        int s = dzielna % dzielnik;
        System.out.println("s= " + s); //% modulo reszta z dzielenia czyli 9 - 4*2 =1

        int s2 = dzielna - ((dzielna / dzielnik) * dzielnik);
        System.out.println("s zapis bez %= " + s2);
    }
}
