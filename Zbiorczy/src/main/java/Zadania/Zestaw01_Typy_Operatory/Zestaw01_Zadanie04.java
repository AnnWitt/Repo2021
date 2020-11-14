package Zadania.Zestaw01_Typy_Operatory;

public class Zestaw01_Zadanie04 {
    public static void main(String[] args) {

        int a=27,b=14,c=10;
        System.out.println(a + " " +b + " "+ c);

        a=a+b+c;
        c=a-b-c;
        b=a-c-b;
        a=a-b-c;

        System.out.println(a + " " +b + " "+ c);

        //a=b, b=c,c=a
        //a) przepisz wartości - do zmiennej 'a' przypisz wartość 'b', do zmiennej 'b'
        //przypisz wartość 'c', do zmiennej 'c' przypisz wartość 'a'.


    }
}
