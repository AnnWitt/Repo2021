package Zadania.Zestaw01_Typy_Operatory;

class Zestaw01_Zadanie10_ZRownosca {
    public static void main(String[] args) {
        int a = 30, b = 7, c = 7, max;
        System.out.println(a + " " + b + " " + c);
        if (a >= b) {
            //a>b
            if (a == b || a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b == c || b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println(max);
    }
}
