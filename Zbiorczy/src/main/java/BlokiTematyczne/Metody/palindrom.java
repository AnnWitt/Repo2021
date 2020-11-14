package BlokiTematyczne.Metody;

import java.util.Scanner;

class palindrom { ///////zrobic od bez dodatkowych zmiennyuch word --> W DOMU !!!!!
    //porownywanie pierwssze z ostatnim, drugi z przedostatnim - jeden string i jedna petla
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "Tenet";
        String word3 = "tenet";
        System.out.println("word " + word);
        word.toLowerCase(); //porównanie bez wielkosci znakow
        //charAt(0) - zero,
        String[] Tablica = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            Tablica[i] = String.valueOf(word.charAt(i));
        }
        String word2 = "";

        for (int i = (word.length() - 1); i >= 0; i--) {
            //System.out.print(Tablica[i]);
            word2 = word2 + Tablica[i];
        }
        //System.out.println();
        System.out.println("word 2 " + word2);
        System.out.println("word 3 " + word3);

        System.out.print("word 3 i word 2 ");
        if (word3.toLowerCase().equals(word2.toLowerCase())) {
            System.out.println("jest palidronem");
        } else {
            System.out.println("nie jest palidronem");
        }

//koniec

    }
}
