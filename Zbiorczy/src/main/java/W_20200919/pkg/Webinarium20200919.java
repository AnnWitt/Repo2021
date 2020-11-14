package W_20200919.pkg;

public class Webinarium20200919 {

    public static void main(String[] args) {
        byte b = 127;
        int i = 1000; /* komentarz, moze byc wieloliniowy*/
        short s = 100;
        long l = 1_000_000; /*myslniki sa ignorowane, tylko dla czytelnosci*/
        char c = 'a';
        float f = 10.1f;
        double d = 10.13123312;
        String string = "Hello world";

        //'operatory'
        long l2 = 10 + i + l;

        System.out.println(l2);
        l2 = l2 - l;
        System.out.println(l2);
        l2 = l2 / 2 + 10 * 23; /*pierwszenstwo zgodne z matematyczna kolejnoscia  */
        l2 = (l2 / 2) + (10 * 23); /*ew mozna z nazwiasami*/
        /*tak naprawde mozna zapisac to w jednej lini bez; - kompilator to pominie*/
        /* operatory przypisania'*/
        l2 /= 10;
        /*to samo co*/
        l2 = l2 / 10;
        i = 0;
        ++i; /*zwiekszenie o 1*/
        i++; /*to samo co powyżej*/

        boolean bool = false; //tak tez mozna komentarz ale jedna linia

        bool = l2 <= 1000; //true lub false
        bool = l2 <= 1000 && c == 'b'; //i
        boolean bool2 = (l2 <= 1000) || (c == 'b'); //lub
        bool = !false; //zaprzeczenie, w tej syt zwroci true

        System.out.println(bool + " " + bool2);

        //instrukcje warunkowe

        if (true) {
            //'(!true) to zaprzeczenie'
            //jesli prawda to wykonaj
            System.out.println("prawda");
        } else {
            System.out.println("fałsz");
        }

        //pętle
        for (int j = 0; j < 100; j++) { //chcemy to wykonac 10 razy, jesli by nie bylo j++ to zapętlenie
            //dopoki j<10 i na koniec j++ zwiekszamy o jeden
            System.out.println(j);
        }
    }
}
