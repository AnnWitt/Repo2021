package Z_20200926.pkg;

class Zad3 {
    public static void main(String[] args) {

        String a = "2+3";
        System.out.println("a= " + a);
        int b = 2 - 4;
        System.out.println("b= " + b);
        float c = 5 / 2;
        System.out.println("c= " + c);
        double d = (5.0 / 2);
        System.out.println("d= " + d);
        double e = (5 / 2.0);
        System.out.println("e= " + e);
        double f = (5.0 / 2.0);
        System.out.println("f= " + f);
        long g = 100L - 10;
        System.out.println("g= " + g);
        float h = 2f - 3;
        System.out.println("h= " + h);
        float i = 5f / 2;
        System.out.println("i= " + i);
        double j = 5d / 2;
        System.out.println("j= " + j);

        int liczba = 'A' + 2;
        char znak = 'A' + 2;
        System.out.println("k= " + liczba + znak); //zwróciło C - tablica asci
        System.out.println(liczba + znak); // zsumuje - 67+67=134

        System.out.println("l=");
        char l = 'a';
        System.out.println(l); //c
        char l2 = 'a';
        System.out.println(l2 + 2); //c -> 99
        String m = "a+" + 2;

        System.out.println("m= ");
        System.out.println("a" + 2);
        String n = ("a" + "b");
        System.out.println("n= " + n);
        String o = "'a'+'b'";
        System.out.println("o= " + o);
        //String p="(a+'b')"; System.out.println("p= " + p); //"a"+'b'
        //String p="(a+'b')"; System.out.println("p= " + p); //"a"+'b'
        System.out.println("o=");
        System.out.println('a' + b); //"a"+'b'
        String q = "(a+'b'+3)";
        System.out.println("q= " + q); //"a"+'b'+3
        String r = "('b'+3+" + a + ")";
        System.out.println("r= " + r); //
        char procent = '%';
        String s = ("9" + procent + "4");
        System.out.println("s= " + s); //
//przerób to w domu na porządnie (operacje na asci)


    }

}

