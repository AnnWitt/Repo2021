package z20210821.cwiczeniaklas;

public class Exercise7 {

/*    7. Utwórz klasę Exercise7. Zadeklaruj zmienną typu logicznego. Przypisz do zmiennej wynik wyrażenia:
            3 jest mniejsze lub równe 5
    oraz jednocześnie:
            10 jest różne od 15 lub 15 jest mniejsze od 10.
    Wypisz wartość zmiennej w konsoli.*/

   // static boolean log=(3<5)&&(10!=15 || 15<10);
   // private int a, b,c,d;
    private boolean wynik;

    public void display() {
        //System.out.println("wartosc logiczna " + log);
        System.out.println("wartosc logiczna " + wynik);
    }

    void displayPRV() {
        //System.out.println("wartosc logiczna " + log);
        System.out.println("wartosc logiczna " + isWynik());
    }

    public Exercise7(int a,int b,int c,int d) {
    /*    this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;*/

        this.wynik=(a<b)&&(c!=d || d<c);
    }

    public boolean isWynik() {
        return wynik;
    }


//kilka zmiennych settery

}
