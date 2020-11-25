package BlokiTematyczne.Obiektowosc.Powtorki.OOP.pkg.KlasaWKlasie.pkg;

public class Main {
    public static void main(String[] args) {
        MyOuterClass myOuterClass = new MyOuterClass();
        MyOuterClass.MyInnerClass myInnerClass1 = myOuterClass.init(); //wywolanie klasy z klasy
        myInnerClass1.printNumber();    // 5
        //drugi sposob
        MyOuterClass.MyInnerClass myInnerClass2 = myOuterClass.new MyInnerClass();
        myInnerClass2.printNumber();    // 5


        ZewnetrznaKlasa zewnKl=new ZewnetrznaKlasa();
        //Do stworzenia instancji klasy wewnętrznej potrzebujemy instancji klasy zewnętrznej.
        ZewnetrznaKlasa.wewnetrznaKlasa wewWzew= zewnKl.wywolanie();
        wewWzew.wypiszTekst();
        wewWzew.dupa();

        System.out.println("drugi sposob");
        ZewnetrznaKlasa zewnKl2metoda=new ZewnetrznaKlasa();
        ZewnetrznaKlasa.wewnetrznaKlasa wewWzew2=zewnKl2metoda.new wewnetrznaKlasa(); //zasadniczo tresc zwrotu klasy wywolanie
        wewWzew2.dupa();
        wewWzew2.wypiszTekst();

        System.out.println();
        System.out.println("wewnetrzna statyczna");
        StatycznaWewnetrzna statycznaWewnetrzna=new StatycznaWewnetrzna();

        System.out.println("statyczna pierwszy sposob");
        StatycznaWewnetrzna.MyInnerClassStatis wyw1= new StatycznaWewnetrzna.MyInnerClassStatis(); //w zasadzie i bez tego pojdzie
        wyw1=statycznaWewnetrzna.wyw();  //w zasadzie i bez tego pojdzie
        statycznaWewnetrzna.wyw();

        System.out.println();
        System.out.println("statyczna drugi sposob");
        StatycznaWewnetrzna.MyInnerClassStatis wyw2= statycznaWewnetrzna.wyw();

        System.out.println();
       /* public int myNumber = 18;                // zwykłe pole publiczne, wymaga instancji klasy
        public static int myStaticNumber = 21;   // pole statyczne klasy, NIE wymaga instancji klasy*/
        System.out.println(PolaStatyczne.myStaticNumber); //odwołaliśmy się do statycznego pola myStaticNumber bazując na typie klasy, a nie instancji obiektu tej klas
        //System.out.println(PolaStatyczne.myNumber); błąd
        PolaStatyczne stat=new PolaStatyczne();
        System.out.println(stat.myNumber); //odwołaniem się do instancyjnego pola myNumber.


    }

}
/*
    public class ZewnetrznaKlasa {
    private String nazwa="Test klas";
    public class wewnetrznaKlasa {
        public void wypiszTekst (){
            System.out.println(nazwa);
        }
        public void dupa (){
            System.out.println(nazwa+" duppa");
        }
    }
    public wewnetrznaKlasa wywolanie () {
        return new wewnetrznaKlasa();
    }
}

    }*/
