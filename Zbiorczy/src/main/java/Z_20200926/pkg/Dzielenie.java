package Z_20200926.pkg;

class Dzielenie {
    public static void main(String[] args) {
        int a = 1;//deklaracja trzch w jednej lini po przecinku ale zobacz czemu nie zadzialalo
        int b = 2;
        int c = 3;

        System.out.println("dzielenie");
        System.out.println(a / 2);
        System.out.println(a / b);
        System.out.println(1 / 1);
        System.out.println(a / (b / c)); //wyjątek
        c = a + b;
    }
}
