package z20210807;

public class ExampleString {

    public static void main(String[] args) {
        //wywołania

        wycinanieSpacji();

/*        String text1="tekst1";
        String text2="tekst1";
        //ta sama referencja, ten sam obiekt
        String text3=new String("tekst1"); //nowa referencja

        System.out.println(text1==text2); //true
        System.out.println(text2==text3); //false
        System.out.println(text1==text3); //ctrl d na koncu wiersza //false
        System.out.println(text1.equals(text2)); //true
        System.out.println(text1.equals(text3)); //true*/

    }


//text1.toUpperCase();




        //-------- metody -----------
     /*   private static void ciadDoWhile (){
        System.out.println();
        System.out.println("wartość sumy wyrazów ciągu arytmetycznego. Wartość pierwszego wyrazu\n" +
                "        ciagu to 5, różnica każdych kolejnych dwóch wyrazów to 2. Chcemy zsumować 459\n" +
                "    wyrazów (skorzystaj  z pętli for)");
        int sumaCiagu=5;
        int wyrazCiagu=5;
        int dlugoscCiaguPozaPetle=1;
        for (int dlugoscCiagu=1; dlugoscCiagu<459;dlugoscCiagu++) {

            if (wyrazCiagu==5) {
                System.out.println(5);
            }
            //System.out.println(wyrazCiagu);
            wyrazCiagu=wyrazCiagu+2;
            System.out.println(wyrazCiagu);

            sumaCiagu=sumaCiagu+wyrazCiagu;
            dlugoscCiaguPozaPetle=dlugoscCiagu;
        }
        System.out.println("suma " + sumaCiagu + "  dlugosc ciagu wynosi: " + (dlugoscCiaguPozaPetle+1));}*/


        //zdanie dowolne, w zdaniue wyciac wszystkie spacje uzywajac replace all

        private static void wycinanieSpacji(){
            String zdanieDoWycieciaSpacji="Jakieś zdanie aby wywalić spacje";
            System.out.println(zdanieDoWycieciaSpacji.replaceAll(" ",""));
        }

private static void inoOut () {

}





        /*private static void zadanieDodatkowe(){
*//*            Zadanie polega na znalezieniu brakującej liczby w tablicy. Np. [1,2,3,4,6] odp 5, jeżeli w
        tablicy nie brakuje zadnego elementu zwróć -1. Tablica może być do 100 elementów. Rozważ w
        późniejszym etapie znalezienie wszystkich brakujących elementów. W wariancie trudniejszym
        tablica będzie nie posortowana, czyli [6,3,2,1,4], mogą wystąpić również duplikaty np. [1,1,3,2,4,6]*/
        }

        //klasa String

        //------metody-------------




