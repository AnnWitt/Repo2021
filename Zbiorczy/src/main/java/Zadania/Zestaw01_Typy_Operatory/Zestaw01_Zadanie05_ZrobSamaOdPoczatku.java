package Zadania.Zestaw01_Typy_Operatory;

class Zestaw01_Zadanie05_ZrobSamaOdPoczatku {
    public static void main(String[] args) {
        boolean jest_cieplo = false;
        boolean wieje_wiatr = true;
        boolean swieci_slonce = false;

        boolean ubieram_sie_cieplo;
        boolean biore_parasol;
        boolean ubieram_kurtke;

        System.out.println("Czy ciepło: " + jest_cieplo);
        System.out.println("czy wiatr: " + wieje_wiatr);
        System.out.println("czy swieci słonce: " + swieci_slonce);

        //ubieram_sie_cieplo - jesli nie jest cieplo lub wieje wiatr
        ubieram_sie_cieplo = (jest_cieplo == false) || (wieje_wiatr == true); // true||true
        ubieram_sie_cieplo = (!jest_cieplo) || (wieje_wiatr); // true||true
        //tożsame z


        System.out.println("ubieram się cieplo: " + ubieram_sie_cieplo); //true

        //jest cieplo== false i czywieje true - sprawdza najpierw pierwszy dopiero pozniej drugi, przechodzi dalej
        //jezeli pierwsze jest prawdziwe, dopiero potem drugie
        ubieram_sie_cieplo = (jest_cieplo == false || wieje_wiatr == false);//poprawne


        //biore_parasol - jesli nie swieci slonce ale nie wieje wiatr
        biore_parasol = ((swieci_slonce == false) && (wieje_wiatr == false)); //true&&false ->false
        System.out.println("biore parasol: " + biore_parasol); //ok
        biore_parasol = (!swieci_slonce && wieje_wiatr);//poprawne

        //ubieram_kurtke - jesli wieje, nie ma slonca i nie jest cieplo
        //na raty bo tylko dwa warunki wchodzą
        boolean slonce_i_cieplo;

        ubieram_kurtke = (((wieje_wiatr == true) && (jest_cieplo == false) && (swieci_slonce == false))); // mozna wiecej niż dwa
        ubieram_kurtke = (wieje_wiatr && !jest_cieplo && !swieci_slonce); // mozna wiecej niż dwa !zzz negacja = zzz==false
        System.out.println("ubieram kurtke: " + ubieram_kurtke);


//        true && true	true
//        true && false	false
//        false && true	false
//        false && false false

        boolean czywlaczony = true;
        System.out.println(czywlaczony == true);
        System.out.println(czywlaczony);//tożsame
        System.out.println(!czywlaczony); //czy jest = false wiec = false

//!!!!!!!!!!!!!!sprawdz w domu, pokombinuj
    }
}
