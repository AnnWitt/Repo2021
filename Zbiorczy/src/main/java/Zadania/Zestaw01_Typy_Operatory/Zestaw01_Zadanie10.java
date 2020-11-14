package Zadania.Zestaw01_Typy_Operatory;

class Zestaw01_Zadanie10 {
    public static void main(String[] args) {
        int a = 30, b = 15, c = 7, max;
        System.out.println(a + " " + b + " " + c);
        if (a > b) {
            //a>b
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println(max);
    }
}
